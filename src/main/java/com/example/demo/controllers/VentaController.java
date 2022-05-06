package com.example.demo.controllers;

import java.util.ArrayList;

import com.example.demo.models.VentaModel;
import com.example.demo.services.VentaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/venta")
public class VentaController {

    @Autowired
    VentaService ventaService;

    @GetMapping()
    public ArrayList<VentaModel> obtenerVentas(){
        return ventaService.obtenerVentas();
    }
    
}
