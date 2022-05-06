package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.CategoriaModel;
import com.example.demo.repositories.CategoriaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

    @Autowired
    CategoriaRepository categoriaRepository;

    public ArrayList<CategoriaModel> obteneid(){
        return (ArrayList<CategoriaModel>) categoriaRepository.findAll();
    }

    public CategoriaModel guardarCategoria(CategoriaModel usuarioModel){
        return categoriaRepository.save(usuarioModel);
    }

    public Optional<CategoriaModel> obtenerPorId(Long id){
        return categoriaRepository.findById(id);
    }

    public boolean eliminarCategoria(Long id) {
        try{
            categoriaRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }
    
}
