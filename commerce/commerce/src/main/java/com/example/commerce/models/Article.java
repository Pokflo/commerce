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
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable =false)
    private String nom;
    @Column(nullable =false)
    private String prix;
    @Column(nullable =false)
    private Integer qtstock;
    @Column(columnDefinition = "TEXT")
    private String description;

   @ManyToOne(optional = false)
   private Categorie categorie;

   @OneToMany(mappedBy = "article")
   private Collection<Image> image;

   @OneToMany(mappedBy = "article")
   private Collection<Article_Commande> articleCommandes = new ArrayList<>();

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

    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

    public Integer getQtstock() {
        return qtstock;
    }

    public void setQtstock(Integer qtstock) {
        this.qtstock = qtstock;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public Collection<Image> getImage() {
        return image;
    }

    public void setImage(Collection<Image> image) {
        this.image = image;
    }

    public Collection<Article_Commande> getArticleCommandes() {
        return articleCommandes;
    }

    public void setArticleCommandes(Collection<Article_Commande> articleCommandes) {
        this.articleCommandes = articleCommandes;
    }

    @Override
    public String toString() {
        return "Article [articleCommandes=" + articleCommandes + ", categorie=" + categorie + ", description="
                + description + ", id=" + id + ", image=" + image + ", nom=" + nom + ", prix=" + prix + ", qtstock="
                + qtstock + "]";
    }

    
    
}