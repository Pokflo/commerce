package com.example.commerce.services;

import java.util.Optional;

import com.example.commerce.models.Adresse;
import com.example.commerce.repositories.AdresseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
public class AdresseService{

    @Autowired
    AdresseRepository adresseRepository;

    public  Iterable<Adresse> trouveTout(){
        return adresseRepository.findAll();
    }

    public Adresse enregistre(Adresse adresse){
        adresseRepository.save(adresse);
        return adresseRepository.save(adresse);
    }

    public void supprime(Adresse adresse){
        adresseRepository.delete(adresse);
    }
    public Adresse trouveUnePersonne(Integer id){
       Optional<Adresse> adresse = adresseRepository.findById(id);
       if (adresse.isPresent()){
           return adresse.get();
       }
       return null;
       
    }
}