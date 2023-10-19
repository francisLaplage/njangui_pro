package fr.njangui_pro.controleur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.njangui_pro.entities.Membre;
import fr.njangui_pro.repository.MembreRepository;

@RestController
//@RequestMapping(path = "/membres",produces = MediaType.APPLICATION_JSON_VALUE)
@RequestMapping("/membres")
public class MembresControleur {
	@Autowired
	private MembreRepository membreRepository;
	
	@RequestMapping("/all")
	public List<Membre> getAllMembre(){
		//return List.of(new Membre("Simpson", "simpson@gmail.com"));
		return this.membreRepository.findAll();
	}

}
