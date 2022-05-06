package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.CategoriaModel;
import com.example.demo.services.CategoriaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/categoria")
public class CategoriaController {
    @Autowired
    CategoriaService categoriaService;

    @GetMapping()
    public ArrayList<CategoriaModel> obtenerCategorias(){
        return categoriaService.obteneid();
    }

    @PostMapping()
    public CategoriaModel guardarCategoria(@RequestBody CategoriaModel usuario){
        return this.categoriaService.guardarCategoria(usuario);
    }

    @GetMapping( path = "/{id}")
    public Optional<CategoriaModel> obtenerCategoriaPorId(@PathVariable("id") Long id) {
        return this.categoriaService.obtenerPorId(id);
    }

    @PutMapping()
    public CategoriaModel guardarPutCategoria(@RequestBody CategoriaModel usuario){
        return this.categoriaService.guardarCategoria(usuario);
    }

    @PatchMapping()
    public CategoriaModel guardarPatchUsuario(@RequestBody CategoriaModel usuario){
        return this.categoriaService.guardarCategoria(usuario);
    }

    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.categoriaService.eliminarCategoria(id);
        if (ok){
            return "Se eliminó el usuario con id " + id;
        }else{
            return "No pudo eliminar el usuario con id" + id;
        }
    }
    
}
