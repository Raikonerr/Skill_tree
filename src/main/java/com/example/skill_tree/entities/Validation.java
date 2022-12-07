package com.example.skill_tree.entities;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name = "validations")

public class Validation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private Long id;

    @Column(name = "level_one")
    @Basic
    private String level_one;

    @Column(name = "level_two")
    @Basic
    private String level_two;

    @Column(name = "level_three")
    @Basic
    private String level_three;

    @OneToOne
    @JoinColumn(name = "competence_id", referencedColumnName = "id")
    private Comptence competence;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLevel_one() {
        return level_one;
    }

    public void setLevel_one(String level_one) {
        this.level_one = level_one;
    }

    public String getLevel_two() {
        return level_two;
    }

    public void setLevel_two(String level_two) {
        this.level_two = level_two;
    }

    public String getLevel_three() {
        return level_three;
    }

    public void setLevel_three(String level_three) {
        this.level_three = level_three;
    }

    public Comptence getCompetence() {
        return competence;
    }

    public void setCompetence(Comptence competence) {
        this.competence = competence;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
