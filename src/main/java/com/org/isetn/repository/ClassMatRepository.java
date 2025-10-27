package com.org.isetn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.org.isetn.entities.ClassMat;

public interface ClassMatRepository extends JpaRepository<ClassMat, Long> {
    
    // Optional custom query method to find by class and subject IDs
    ClassMat findByClasseCodClassAndMatiereCodMat(Long codClass, Long codMat);
}
