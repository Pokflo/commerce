package com.example.commerce.models;

import java.util.Date;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable =false)
    private Float total;
    @Column(nullable =false)
    @Temporal(TemporalType.DATE)
    private Date date;

    @ManyToOne(optional = false)
    private Utilisateur utilisateur;

    @OneToMany(mappedBy = "commande")
    private Collection<Article_Commande> articleCommande = new ArrayList<>();
   
    public Commande() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public Collection<Article_Commande> getArticleCommande() {
        return articleCommande;
    }

    public void setArticleCommande(Collection<Article_Commande> articleCommande) {
        this.articleCommande = articleCommande;
    }

    @Override
    public String toString() {
        return "Commande [articleCommande=" + articleCommande + ", date=" + date + ", id=" + id + ", total=" + total
                + ", utilisateur=" + utilisateur + "]";
    }

   
    
}