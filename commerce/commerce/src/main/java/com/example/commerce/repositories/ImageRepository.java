package com.example.commerce.repositories;

import com.example.commerce.models.Image;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ImageRepository extends CrudRepository<Image, Integer> {

}
