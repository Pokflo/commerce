package com.example.commerce.repositories;

import com.example.commerce.models.Categorie;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CategorieRepository extends CrudRepository<Categorie, Integer> {

}