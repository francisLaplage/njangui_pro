package fr.njangui_pro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.njangui_pro.entities.Membre;
import fr.njangui_pro.repository.MembreRepository;

@SpringBootApplication
public class NjanguiProApplication implements CommandLineRunner{

	@Autowired
	private MembreRepository membreRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(NjanguiProApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		this.membreRepository.save(
				new Membre(0,"Simpson","Bart","bart@gmail.com","042356987","Rue de picpus 112 75012 Paris","bart.jpg"));
		this.membreRepository.save(
				new Membre(0,"Simpson","lisa","lisa@gmail.com","042356987","Rue de picpus 112 75012 Paris","lisa.jpg"));
		this.membreRepository.save(
				new Membre(0,"Simpson","omer","omer@gmail.com","042356987","Rue de picpus 112 75012 Paris","omer.jpg"));
		
	}
}
