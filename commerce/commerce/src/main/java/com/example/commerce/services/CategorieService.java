package com.example.commerce.services;

import java.util.Optional;


import com.example.commerce.models.Categorie;

import com.example.commerce.repositories.CategorieRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
public class CategorieService{

    @Autowired
    CategorieRepository categorieRepository;

    public  Iterable<Categorie> trouveTout(){
        return categorieRepository.findAll();
    }

    public Categorie enregistre(Categorie categorie){
        categorieRepository.save(categorie);
        return categorieRepository.save(categorie);
    }

    public void supprime(Categorie categorie){
        categorieRepository.delete(categorie);
    }
    public Categorie trouveUnePersonne(Integer id){
       Optional<Categorie> categorie = categorieRepository.findById(id);
       if (categorie.isPresent()){
           return categorie.get();
       }
       return null;
       
    }
}