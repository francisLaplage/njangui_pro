package fr.njangui_pro.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import fr.njangui_pro.entities.Membre;
import fr.njangui_pro.repository.MembreRepository;

@Service
public class MembreService {
	
	private MembreRepository membreRepository;

	public MembreService(MembreRepository membreRepository) {
		this.membreRepository = membreRepository;
	}
	
	public List<Membre> getAllMembre(){
		return this.membreRepository.findAll();
	}
	
	public Optional<Membre> getOneMembreById(int id) {
		return this.membreRepository.findById(id);
	}
	public void insertMembre(Membre membre) {
		this.membreRepository.save(membre);
	}
	
	public void deleteMembre(Membre membre) {
		this.membreRepository.delete(membre);
	}
	public void updateMembre(Membre membre) {
		this.membreRepository.save(membre);
	}
}
