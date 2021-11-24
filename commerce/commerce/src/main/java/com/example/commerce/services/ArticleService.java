package com.example.commerce.services;

import java.util.Optional;


import com.example.commerce.models.Article;

import com.example.commerce.repositories.ArticleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
public class ArticleService{

    @Autowired
    ArticleRepository articleRepository;

    public  Iterable<Article> trouveTout(){
        return articleRepository.findAll();
    }

    public Article enregistre(Article article){
        articleRepository.save(article);
        return articleRepository.save(article);
    }

    public void supprime(Article article){
        articleRepository.delete(article);
    }
    public Article trouveUnePersonne(Integer id){
       Optional<Article> article = articleRepository.findById(id);
       if (article.isPresent()){
           return article.get();
       }
       return null;
       
    }
}