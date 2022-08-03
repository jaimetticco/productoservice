package com.example.productoservicio.entity;


import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class BodegaProductoFK implements Serializable {

    @Column(name = "id_producto", nullable = false, unique = true)
    private Integer id_producto;

    @Column(name = "id_bodega", nullable = false, unique = true)
    private Integer id_bodega;

    public Integer getId_producto() {
        return id_producto;
    }

    public void setId_producto(Integer id_producto) {
        this.id_producto = id_producto;
    }

    public Integer getId_bodega() {
        return id_bodega;
    }

    public void setId_bodega(Integer id_bodega) {
        this.id_bodega = id_bodega;
    }
}
