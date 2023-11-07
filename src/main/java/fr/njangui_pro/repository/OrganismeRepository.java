package fr.njangui_pro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.njangui_pro.entities.Organisme;

@Repository
public interface OrganismeRepository extends JpaRepository<Organisme, Integer>{

}
