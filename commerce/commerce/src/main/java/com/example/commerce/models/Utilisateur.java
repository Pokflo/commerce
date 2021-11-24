package com.example.commerce.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import com.example.commerce.enumeration.Role;


@Entity
public class Utilisateur {

    @Id
    @Column(nullable = false)
    private String email;
   
    @Column(nullable = false)
    private String nom;
   
    @Column(nullable = false)
    private String prenom;
   
    @Transient
    private Integer motDePasse;

    @Transient
    private String verifMdp;

    
    @Temporal(TemporalType.DATE)
    private Date naissance;
   
    private String tel;
   
    @Enumerated(EnumType.STRING)
    private Role role;

    @ManyToOne(optional = false)
    private Adresse adresse;

    @OneToMany(mappedBy = "utilisateur")
    private Collection<Commande> commande = new ArrayList<>();

    public Utilisateur() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Integer getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(Integer motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getVerifMdp() {
        return verifMdp;
    }

    public void setVerifMdp(String verifMdp) {
        this.verifMdp = verifMdp;
    }

    public Date getNaissance() {
        return naissance;
    }

    public void setNaissance(Date naissance) {
        this.naissance = naissance;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public Collection<Commande> getCommande() {
        return commande;
    }

    public void setCommande(Collection<Commande> commande) {
        this.commande = commande;
    }

    @Override
    public String toString() {
        return "Utilisateur [adresse=" + adresse + ", commande=" + commande + ", email=" + email + ", motDePasse="
                + motDePasse + ", naissance=" + naissance + ", nom=" + nom + ", prenom=" + prenom + ", role=" + role
                + ", tel=" + tel + ", verifMdp=" + verifMdp + "]";
    }

    
}