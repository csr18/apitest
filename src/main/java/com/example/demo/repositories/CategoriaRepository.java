package com.example.demo.repositories;

import com.example.demo.models.CategoriaModel;

import org.springframework.data.repository.CrudRepository;

public interface CategoriaRepository extends CrudRepository<CategoriaModel, Long>{
    
}
