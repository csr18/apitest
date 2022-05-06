package com.example.demo.repositories;

import com.example.demo.models.VentaModel;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.repository.CrudRepository;

@FeignClient(name = "venta", url = "http://localhost:8080")
public interface VentaRepository extends CrudRepository<VentaModel, Long>{

}