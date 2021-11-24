package com.example.commerce.repositories;

import com.example.commerce.models.Commande;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CommandeRepository extends CrudRepository<Commande, Integer> {

}