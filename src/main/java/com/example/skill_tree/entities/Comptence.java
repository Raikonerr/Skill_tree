package com.example.skill_tree.entities;
import com.example.skill_tree.entities.*;
import jakarta.persistence.*;
import java.util.*;
@Entity
@Table(name = "competences")
public class Comptence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private Long id;
    @Column(name = "name")
    @Basic
    private String name;



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
}
