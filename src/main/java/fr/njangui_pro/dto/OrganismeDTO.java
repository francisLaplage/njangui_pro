package fr.njangui_pro.dto;

import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data @NoArgsConstructor @AllArgsConstructor
public class OrganismeDTO {
	private int id;
	private String nom;
	private Date dateCreation;
	private String logo;
}
