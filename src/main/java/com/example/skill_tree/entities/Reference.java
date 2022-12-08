package com.example.skill_tree.entities;

import jakarta.persistence.*;
import java.util.*;


@Entity
@Table(name = "references")
public class Reference {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private Long id;
    @Column(name = "name")
    @Basic
    private String name;
    @OneToMany
    @JoinColumn(name = "competence_id", referencedColumnName = "id")
    private List<Comptence> competences;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Comptence> getCompetences() {
        return competences;
    }
    public void setCompetences(List<Comptence> competences) {
        this.competences = competences;
    }

}
