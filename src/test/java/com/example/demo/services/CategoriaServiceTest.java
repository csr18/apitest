package com.example.demo.services;

import com.example.demo.models.CategoriaModel;
import com.example.demo.repositories.CategoriaRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class CategoriaServiceTest {

    @Mock
    private CategoriaRepository categoriaRepository;

    @InjectMocks
    private CategoriaService categoriaService;

    private CategoriaModel categoriaModel;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);

        categoriaModel = new CategoriaModel();
        categoriaModel.setId_cat(12);
        categoriaModel.setNombre_categoria("Cat-B");
        categoriaModel.setDescripcion("Categoria B");

    }

    @Test
    void obteneid() {
        when(categoriaRepository.findAll()).thenReturn(Arrays.asList(categoriaModel));
        assertNotNull(categoriaService.obteneid());
    }

    @Test
    void guardarCategoria() {
        when(categoriaRepository.findAll()).thenReturn(Arrays.asList(categoriaModel));
    }

    @Test
    void obtenerPorId() {
        when(categoriaRepository.findAll()).thenReturn(Arrays.asList(categoriaModel));
    }

    @Test
    void eliminarCategoria() {
        when(categoriaRepository.findAll()).thenReturn(Arrays.asList(categoriaModel));
    }
}