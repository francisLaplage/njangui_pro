package fr.njangui_pro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.njangui_pro.entities.Membre;

@Repository
public interface MembreRepository extends JpaRepository<Membre, Integer>{

}
