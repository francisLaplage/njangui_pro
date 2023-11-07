package fr.njangui_pro.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MembreDTO {
	private int id;
	private String nom;
	private String prenom;
	private String email;
	private String tel;
	private String adresse;
	private String photo;
	
	private String organisme;
}
