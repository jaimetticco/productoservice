package com.example.productoservicio.service;

import com.example.productoservicio.entity.BodegaProductoFK;
import com.example.productoservicio.entity.Producto;
import com.example.productoservicio.entity.ProductoDetalle;
import com.example.productoservicio.repository.DetalleProductoRepository;
import com.example.productoservicio.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService{

    @Autowired
    private ProductoRepository productoRepository;
    @Autowired
    private DetalleProductoRepository detalleRepository;

    @Override
    public List<Producto> listar() {
        return productoRepository.findAll();
    }

    @Override
    public void guardar(Producto producto) {
        productoRepository.save(producto);
    }

    @Override
    public void asignarProductoBodega() {
        BodegaProductoFK fk = new BodegaProductoFK();
        fk.setId_bodega(1);
        fk.setId_producto(1);

        ProductoDetalle detalle = new ProductoDetalle();
        detalle.setFk(fk);
        detalleRepository.save(detalle);


    }
}
