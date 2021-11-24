package com.example.commerce.services;

import java.util.Optional;


import com.example.commerce.models.Image;

import com.example.commerce.repositories.ImageRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
public class ImageService{

    @Autowired
    ImageRepository imageRepository;

    public  Iterable<Image> trouveTout(){
        return imageRepository.findAll();
    }

    public Image enregistre(Image image){
        imageRepository.save(image);
        return imageRepository.save(image);
    }

    public void supprime(Image image){
        imageRepository.delete(image);
    }
    public Image trouveUnePersonne(Integer id){
       Optional<Image> image = imageRepository.findById(id);
       if (image.isPresent()){
           return image.get();
       }
       return null;
       
    }
}