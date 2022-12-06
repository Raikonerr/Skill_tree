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
    @Column(name = "email")
    @Basic
    private String email;
    @Column(name = "password")
    @Basic
    private String password;
    @Column(name = "image")
    @Basic
    private String image;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }









}


