package com.example.productoservicio.client;

import com.example.productoservicio.dto.Bodega;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name="idat-bodega", url="localhost:8080")
public interface OpenFeingClient {
    @GetMapping("/api/bodega/v1/listar")
    public List<Bodega> listarAlumnosSeleccionados();
}
