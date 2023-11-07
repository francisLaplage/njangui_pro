package fr.njangui_pro.service;

import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import fr.njangui_pro.dto.OrganismeDTO;
import fr.njangui_pro.entities.Organisme;
import fr.njangui_pro.mapper.OrganismeDTOMapper;
import fr.njangui_pro.repository.OrganismeRepository;

@Service
public class OrganismeService {
	private OrganismeRepository organismeRepository;
	private OrganismeDTOMapper dtoMapper;
	
	public OrganismeService(OrganismeRepository organismeRepository, OrganismeDTOMapper dtoMapper) {
		super();
		this.organismeRepository = organismeRepository;
		this.dtoMapper = dtoMapper;
	}
	
	public Stream<OrganismeDTO> getAllOrganisme(){
		return this.organismeRepository.findAll().stream().map(dtoMapper);
	}
	public void insertOrganisme(Organisme organisme) {
		this.organismeRepository.save(organisme);
	}
	public Optional<Organisme> getOneOrganisme(int id){
		return this.organismeRepository.findById(id);
	}
	public void updateOrganisme(Organisme organisme) {
		this.organismeRepository.save(organisme);
	}
	public void deleteOrganisme(Organisme organisme) {
		this.organismeRepository.delete(organisme);
	}
}
