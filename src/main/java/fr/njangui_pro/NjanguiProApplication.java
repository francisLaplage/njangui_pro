package fr.njangui_pro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.njangui_pro.entities.Membre;
import fr.njangui_pro.repository.MembreRepository;

@SpringBootApplication
public class NjanguiProApplication{

	@Autowired
	private MembreRepository membreRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(NjanguiProApplication.class, args);
	}



}
