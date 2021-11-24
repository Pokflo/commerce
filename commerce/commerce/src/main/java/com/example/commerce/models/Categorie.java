package com.example.commerce.models;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Categorie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String nom;

    @ManyToOne
    private Categorie categorie;

    @OneToMany(mappedBy = "categorie")
    private Collection<Article> article = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public Collection<Article> getArticle() {
        return article;
    }

    public void setArticle(Collection<Article> article) {
        this.article = article;
    }

    @Override
    public String toString() {
        return "Categorie [article=" + article + ", categorie=" + categorie + ", id=" + id + ", nom=" + nom + "]";
    }
    
    
}