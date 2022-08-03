package com.example.productoservicio.service;

import com.example.productoservicio.entity.Producto;

import java.util.List;

public interface ProductoService {
    List<Producto> listar();

    void guardar(Producto producto);


    void asignarProductoBodega();
}
