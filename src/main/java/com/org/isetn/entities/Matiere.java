package com.org.isetn.entities;


import java.util.Collection;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Matiere {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codMat;
	private String intMat;
	private String  Description;
	
    @JsonIgnore
	@ManyToMany(mappedBy = "matieres")
	    private List<Classe> classes;

	   
}