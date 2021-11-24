package com.example.commerce.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Article_Commande implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @ManyToOne
    @JoinColumn
    private Article article;

    @Id
    @ManyToOne
    @JoinColumn
    private Commande commande;

    private Integer qtArticle;

    private Float prix;

   

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public Integer getQtArticle() {
        return qtArticle;
    }

    public void setQtArticle(Integer qtArticle) {
        this.qtArticle = qtArticle;
    }

    public Float getPrix() {
        return prix;
    }

    public void setPrix(Float prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Article_Commande [article=" + article + ", commande=" + commande + ", prix=" + prix + ", qtArticle="
                + qtArticle + "]";
    }

    
}