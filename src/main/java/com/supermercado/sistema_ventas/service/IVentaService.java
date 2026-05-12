package com.supermercado.sistema_ventas.service;

import com.supermercado.sistema_ventas.model.entities.Venta;

import java.util.List;

public interface IVentaService {

    //Create
    Venta save(Venta venta);

    //Read
    List<Venta> getAll();

    //Update
    Venta update(Venta venta, Long ventaId);

    //Delete
    void delete(Long ventaId);

}
