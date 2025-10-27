package com.org.isetn.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.isetn.entities.Classe;



@Repository
public interface ClasseRepository extends JpaRepository<Classe, Long> {
}
