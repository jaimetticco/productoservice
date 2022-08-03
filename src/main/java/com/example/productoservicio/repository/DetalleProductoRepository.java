package com.example.productoservicio.repository;

import com.example.productoservicio.entity.ProductoDetalle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleProductoRepository extends JpaRepository<ProductoDetalle, Integer> {
}
