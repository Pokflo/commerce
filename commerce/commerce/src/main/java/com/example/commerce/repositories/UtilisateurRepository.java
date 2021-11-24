package com.example.commerce.repositories;

import com.example.commerce.models.Utilisateur;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UtilisateurRepository extends CrudRepository<Utilisateur, Integer> {

}
