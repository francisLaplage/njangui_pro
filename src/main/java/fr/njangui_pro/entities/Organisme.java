package fr.njangui_pro.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Organisme {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	private Date dateCreation;
	private String logo;
	
	@OneToMany
	private List<Membre> listeMembre = new ArrayList<Membre>();
	
	@OneToMany
	private List<Tour> listeTours = new ArrayList<Tour>();

	public Organisme(int id) {
		super();
		this.id = id;
	}
}
