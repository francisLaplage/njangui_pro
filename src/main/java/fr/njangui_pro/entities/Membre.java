package fr.njangui_pro.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "membre")
public class Membre {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	private String prenom;
	private String email;
	private String tel;
	private String adresse;
	private String photo;
	
	@ManyToOne
	private Organisme organisme;
	
	@ManyToMany
	private List<Cahier> listeCahier = new ArrayList<Cahier>();

	public Membre(int id) {
		super();
		this.id = id;
	}
}
