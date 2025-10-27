package com.org.isetn.entities;

import java.util.Collection;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Classe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codClass;

    private String nomClass;
    private int nbreEtud;

    @JsonIgnore
    @OneToMany(mappedBy = "classe")
    private Collection<Etudiant> etudiants;

    @ManyToMany
    private List<Matiere> matieres;

    // If you have another relation (like ClassMat or Formation), keep it optional:
    @JsonIgnore
    @OneToMany(mappedBy = "classe")
    private Collection<ClassMat> classMats;
}
