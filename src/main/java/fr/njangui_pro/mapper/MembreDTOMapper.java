package fr.njangui_pro.mapper;

import java.util.function.Function;

import org.springframework.stereotype.Component;

import fr.njangui_pro.dto.MembreDTO;
import fr.njangui_pro.entities.Membre;

@Component
public class MembreDTOMapper implements Function<Membre,MembreDTO>{
	@Override
	public MembreDTO apply(Membre t) {
		return new MembreDTO(t.getId(),t.getNom(),t.getPrenom(),t.getEmail(),t.getTel(),t.getAdresse(),t.getPhoto());
	}

}
