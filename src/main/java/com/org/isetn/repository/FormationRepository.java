package com.org.isetn.repository;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.isetn.entities.Formation;

@Repository
public interface FormationRepository extends JpaRepository<Formation, Long> {
	
}