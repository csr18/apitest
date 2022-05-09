package com.example.demo.services;

import com.example.demo.models.ProductoModel;
import com.example.demo.repositories.ProductoRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

class ProductoServiceTest {

    @Mock
    private ProductoRepository productoRepository;

    @InjectMocks
    private ProductoService productoService;

    private ProductoModel productoModel;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);

        productoModel = new ProductoModel();
        productoModel.setId_producto(12);
        productoModel.setNombre_producto("Cat-B");
        productoModel.setDescripcion_producto("Categoria B");
    }

    @Test
    void obtenerProducto() {
        when(productoRepository.findAll()).thenReturn(Arrays.asList(productoModel));
        assertNotNull(productoService.obtenerProducto());
    }

    @Test
    void guardarProducto() {
        when(productoRepository.findAll()).thenReturn(Arrays.asList(productoModel));
    }

    @Test
    void EliminarPtoducto() {
        when(productoRepository.findAll()).thenReturn(Arrays.asList(productoModel));
    }
}