package com.example.commerce.repositories;

import com.example.commerce.models.Adresse;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AdresseRepository extends CrudRepository<Adresse, Integer> {

}
