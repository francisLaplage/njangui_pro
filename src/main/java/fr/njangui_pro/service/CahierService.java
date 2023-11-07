package fr.njangui_pro.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import fr.njangui_pro.entities.Cahier;
import fr.njangui_pro.repository.CahierRepository;

@Component
public class CahierService {
	
	private CahierRepository cahierRepository;

	public CahierService(CahierRepository cahierRepository) {
		super();
		this.cahierRepository = cahierRepository;
	}
	
	public List<Cahier> getAllCahier(){
		return this.cahierRepository.findAll();
	}
	public Optional<Cahier> getOneCahiet(int id){
		return this.cahierRepository.findById(id);
	}
	
	public  void insertCahier(Cahier cahier) {
		this.cahierRepository.save(cahier);
	}
	public void deleteCahier(Cahier cahier) {
		this.cahierRepository.delete(cahier);
	}
	public void updateCahier(Cahier cahier) {
		this.cahierRepository.save(cahier);
	}
}
