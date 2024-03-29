package com.example.commerce.repositories;

import com.example.commerce.models.Article;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ArticleRepository extends CrudRepository<Article, Integer> {

}