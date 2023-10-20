package fr.njangui_pro.controleur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.njangui_pro.entities.Membre;
import fr.njangui_pro.repository.MembreRepository;
import fr.njangui_pro.service.MembreService;

@RestController
//@RequestMapping(path = "/membres",produces = MediaType.APPLICATION_JSON_VALUE)
@RequestMapping("/membres")
public class MembresControleur {
	@Autowired
	private MembreService membreRepository;
	
	@GetMapping("/all")
	public List<Membre> getAllMembre(){
		//return List.of(new Membre("Simpson", "simpson@gmail.com"));
		return this.membreRepository.getAllMembre();
	}
	@PostMapping("/add")
	public void insert(@RequestBody Membre membre) {
		this.membreRepository.insertMembre(membre);
	}
	@DeleteMapping("/delete")
	public void delete(@RequestBody Membre membre) {
		this.membreRepository.deleteMembre(membre);
	}
	@PutMapping("/update")
	public void update(@RequestBody Membre membre) {
		this.membreRepository.updateMembre(membre);
	}
}
