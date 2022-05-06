package com.example.demo.services;

import java.util.ArrayList;

import com.example.demo.models.VentaModel;
import com.example.demo.repositories.VentaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentaService {
    @Autowired
    VentaRepository ventaRepository;

    public ArrayList<VentaModel> obtenerVentas(){
        return (ArrayList<VentaModel>) ventaRepository.findAll();
    }
}
