package com.example.commerce.services;

import com.example.commerce.models.Utilisateur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
public class UtilisateurService {

    @Autowired
    com.example.commerce.repositories.UtilisateurRepository UtilisateurRepository;

    public Iterable<Utilisateur> findall() {
        return UtilisateurRepository.findAll();
    
    }
    public Utilisateur enregistre(Utilisateur p){
        UtilisateurRepository.save(p);
        return UtilisateurRepository.save(p);
    }

    public void supprime(Utilisateur p){
        UtilisateurRepository.delete(p);
    }
}