package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Categoria")
public class CategoriaModel {

    @Id
    @Column(name = "ID_CAT")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_cat;

    private String nombre_categoria;
    private String descripcion;


    public Integer getId_cat() {
        return this.id_cat;
    }

    public void setId_cat(Integer id_cat) {
        this.id_cat = id_cat;
    }

    public String getNombre_categoria() {
        return this.nombre_categoria;
    }

    public void setNombre_categoria(String nombre_categoria) {
        this.nombre_categoria = nombre_categoria;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
