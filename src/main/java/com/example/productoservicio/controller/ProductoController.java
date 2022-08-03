package com.example.productoservicio.controller;

import com.example.productoservicio.entity.Producto;
import com.example.productoservicio.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/api/producto/v1")
public class ProductoController {

    @Autowired
    private ProductoService service;

    @GetMapping("/listar")
    public ResponseEntity<List<Producto>> listarA(){
        List<Producto> au = service.listar();
        return new ResponseEntity<>(au, HttpStatus.OK);    }


    @GetMapping("/asignar")
    public @ResponseBody
    void asignarBodega(){
        service.asignarProductoBodega();
    }
}
