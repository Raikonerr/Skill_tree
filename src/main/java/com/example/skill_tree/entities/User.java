package com.example.skill_tree.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "users")


public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private Long id;
    @Column(name = "username")
    @Basic
    private String username;








}


