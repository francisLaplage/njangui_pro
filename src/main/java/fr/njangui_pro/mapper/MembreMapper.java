package fr.njangui_pro.mapper;

import java.util.function.Function;

import org.springframework.stereotype.Component;

import fr.njangui_pro.dto.MembreDTO;
import fr.njangui_pro.entities.Membre;

@Component
public class MembreMapper implements Function<MembreDTO,Membre>{
	@Override
	public Membre apply(MembreDTO t) {
		return null;
				/*new Membre(t.getId(),t.getNom(),
				t.getPrenom(),
				t.getEmail(),
				t.getTel(),
				t.getAdresse(),
				t.getPhoto(),
				t.getOrganisme());*/
	}
}
