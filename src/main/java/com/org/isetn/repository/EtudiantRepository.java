package com.org.isetn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.isetn.entities.Etudiant;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
	
	public List<Etudiant> findByNomContains(String nom); 
	 List<Etudiant> findByClasseCodClass(Long codClass);
}