package fr.njangui_pro.mapper;

import java.util.function.Function;

import org.springframework.stereotype.Component;

import fr.njangui_pro.dto.OrganismeDTO;
import fr.njangui_pro.entities.Organisme;

@Component
public class OrganismeDTOMapper implements Function<Organisme,OrganismeDTO>{

	@Override
	public OrganismeDTO apply(Organisme t) {
		return new OrganismeDTO(t.getId(),t.getNom(),t.getDateCreation(),t.getLogo());
	}

}
