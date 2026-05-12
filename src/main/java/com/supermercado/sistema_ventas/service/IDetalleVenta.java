package com.supermercado.sistema_ventas.service;

import com.supermercado.sistema_ventas.model.entities.DetalleVenta;
import java.util.List;

public interface IDetalleVenta {

    //Create
    DetalleVenta save(DetalleVenta detalleVenta);

    //Read
    List<DetalleVenta> getAll();

    //Update
    DetalleVenta update(DetalleVenta detalleVenta, Long detalleVentaId);

    //Delete
    void delete(Long detalleVentaId);

}
