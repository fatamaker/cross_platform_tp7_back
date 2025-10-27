package com.org.isetn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.org.isetn.entities.Matiere;

public interface MatiereRepository extends JpaRepository<Matiere, Long> {
    // You can add custom query methods here if needed
}
