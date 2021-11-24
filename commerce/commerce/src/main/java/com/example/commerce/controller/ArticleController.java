package com.example.commerce.controller;



import com.example.commerce.models.Article;
import com.example.commerce.services.ArticleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/article")
public class ArticleController {


    @Autowired
    ArticleService articleService;

    @GetMapping("")
    public String index(Model Model){
        Model.addAttribute("article", articleService.trouveTout());
        Model.addAttribute("page", "article/index");
        return "index.html";
    }

    
    @GetMapping("/create")
    public String create(Model Model){
        Model.addAttribute("article", new Article());
        Model.addAttribute("page", "article/form");
        return "index.html";
    }

    @GetMapping("/{id}/update")
    public String update(Model model,@PathVariable Integer id){
        Article article =articleService.trouveUnePersonne(id);
        if (article == null){
            return "redirect:/article/null";

        }
        model.addAttribute("article", article);
        model.addAttribute("url", article.getId()+"/update");
        model.addAttribute("page", "article/form");
        return "index.htlm";
    }


}
