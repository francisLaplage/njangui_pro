package fr.njangui_pro;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.njangui_pro.entities.Cahier;
import fr.njangui_pro.entities.Membre;
import fr.njangui_pro.entities.Organisme;
import fr.njangui_pro.entities.Tour;
import fr.njangui_pro.repository.CahierRepository;
import fr.njangui_pro.repository.MembreRepository;
import fr.njangui_pro.repository.OrganismeRepository;
import fr.njangui_pro.repository.TourRepository;
import fr.njangui_pro.service.MembreService;
import fr.njangui_pro.service.TourService;

@SpringBootApplication
public class NjanguiProApplication implements CommandLineRunner{

	@Autowired
	private MembreRepository membreRepository;
	@Autowired
	private OrganismeRepository organismeRepository;
	@Autowired
	private TourRepository tourRepository;
	@Autowired
	private TourService tourService;
	
	@Autowired
	private MembreService membreService;
	
	@Autowired
	private CahierRepository cahierRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(NjanguiProApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		this.organismeRepository.save(new Organisme(0,"PHOENIX",null, null, null,null));
		
		this.tourRepository.save(new Tour(0,
											this.tourService.convertStringToDate("2023/11/05"),
											this.tourService.convertStringToDate("2024/05/05"),
											new Organisme(1)));
		
		this.membreRepository.save(
				new Membre(0,"Simpson","Bart","bart@gmail.com","042356987","Rue de picpus 112 75012 Paris","bart.jpg",new Organisme(1),null));
		this.membreRepository.save(
				new Membre(0,"Simpson","lisa","lisa@gmail.com","042356987","Rue de picpus 112 75012 Paris","lisa.jpg",new Organisme(1),null));
		this.membreRepository.save(
				new Membre(0,"Simpson","omer","omer@gmail.com","042356987","Rue de picpus 112 75012 Paris","omer.jpg",new Organisme(1),null));
		
		String str = "Bonjour à tous et Bienvenue dans cette formation de Java 11";
		
		
		/***************************Création des Cahiers ******************************************/
			this.cahierRepository.save(new Cahier(0,"Grand Cahier 1",14,new ArrayList<Membre>()));
			this.cahierRepository.save(new Cahier(0,"Grand Cahier 2",14,new ArrayList<Membre>()));
			this.cahierRepository.save(new Cahier(0,"Grand Cahier 3",14,new ArrayList<Membre>()));
			
		/*****************************Enregistrement des membres dans les cahiers*****************/
		
		
		this.membreService.addMembreToCahier(new Membre(1),new Cahier(1));
		this.membreService.addMembreToCahier(new Membre(1),new Cahier(1));
		this.membreService.addMembreToCahier(new Membre(2),new Cahier(1));
		this.membreService.addMembreToCahier(new Membre(3),new Cahier(1));
		
		
		str.lines().forEach(elt->System.out.println(elt));
		
		
		 //utiliser le calendrier par défaut
        Calendar calendar = Calendar.getInstance();
        			calendar.add(Calendar.DATE, -2);
 
        //définir le format de la date
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
 
        //Afficher la date du joru
        System.out.println("Aujourd'hui, nous sommes le: "+sdf.format(calendar.getTime()));

        for(int i=0;i<=14;i++) {
        	   calendar.add(Calendar.DATE, 14);
               System.out.println("Dans deux semaines, nous serons le: "+sdf.format(calendar.getTime()));
        }
        
        
        
	}
}
