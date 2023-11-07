package fr.njangui_pro.service;


import java.util.Optional;
import java.util.stream.Stream;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import fr.njangui_pro.dto.MembreDTO;
import fr.njangui_pro.entities.Cahier;
import fr.njangui_pro.entities.Membre;
import fr.njangui_pro.mapper.MembreDTOMapper;
import fr.njangui_pro.repository.CahierRepository;
import fr.njangui_pro.repository.MembreRepository;

@Service
@Transactional
public class MembreService {
	
	private MembreDTOMapper dtoMapper;
	
	private MembreRepository membreRepository;
	
	private CahierRepository cahierRepository;


	public MembreService(MembreDTOMapper dtoMapper, MembreRepository membreRepository,CahierRepository cahierRepository) {

		this.dtoMapper = dtoMapper;
		this.membreRepository = membreRepository;
		this.cahierRepository = cahierRepository;
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
	
	public void addMembreToCahier(Membre membre,Cahier cahier) {
		
		Cahier cah = this.cahierRepository.getById(cahier.getId());
		
		Membre adh = this.membreRepository.getById(membre.getId());
			   adh.getListeCahier().add(cah);		
	}
}
