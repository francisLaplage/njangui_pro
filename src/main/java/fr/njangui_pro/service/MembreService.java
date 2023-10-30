package fr.njangui_pro.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import fr.njangui_pro.dto.MembreDTO;
import fr.njangui_pro.entities.Membre;
import fr.njangui_pro.mapper.MembreDTOMapper;
import fr.njangui_pro.repository.MembreRepository;

@Service
public class MembreService {
	
	private MembreDTOMapper dtoMapper;
	
	private MembreRepository membreRepository;


	public MembreService(MembreDTOMapper dtoMapper, MembreRepository membreRepository) {

		this.dtoMapper = dtoMapper;
		this.membreRepository = membreRepository;
	}

	public Stream<MembreDTO> getAllMembre(){
		return this.membreRepository.findAll().stream().map(dtoMapper);
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
