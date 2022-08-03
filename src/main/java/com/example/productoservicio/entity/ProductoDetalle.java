package com.example.productoservicio.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "bodega_producto")
public class ProductoDetalle {

    @EmbeddedId
    private BodegaProductoFK fk;

    public BodegaProductoFK getFk() {
        return fk;
    }

    public void setFk(BodegaProductoFK fk) {
        this.fk = fk;
    }
}
