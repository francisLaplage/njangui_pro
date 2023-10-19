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
		
		this.membreRepository.save(new Membre(0,"Bart","bart@yahoo.fr"));
		this.membreRepository.save(new Membre(0,"Lisa","lisa@yahoo.fr"));
		this.membreRepository.save(new Membre(0,"Omer","omer@gmail.com"));
	}

}
