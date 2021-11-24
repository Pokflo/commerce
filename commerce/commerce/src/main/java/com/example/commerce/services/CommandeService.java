package com.example.commerce.services;

import java.util.Optional;

import com.example.commerce.models.Commande;
import com.example.commerce.repositories.CommandeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
public class CommandeService{

    @Autowired
    CommandeRepository commandeRepository;

    public  Iterable<Commande> trouveTout(){
        return commandeRepository.findAll();
    }

    public Commande enregistre(Commande commande){
        commandeRepository.save(commande);
        return commandeRepository.save(commande);
    }

    public void supprime(Commande commande) {
        commandeRepository.delete(commande);
    }

    public Commande trouveUnePersonne(Integer id){
       Optional<Commande> commande = commandeRepository.findById(id);
       if (commande.isPresent()){
           return commande.get();
       }
       return null;
       
    }
}