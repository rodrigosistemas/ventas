package com.supermercado.sistema_ventas.service;

import com.supermercado.sistema_ventas.model.entities.Producto;

import java.util.List;

public interface IProductoService {

    //Create
    Producto save(Producto producto);

    //Read
    List<Producto> getAll();

    //Update
    Producto update(Producto producto, Long productoId);

    //Delete
    void delete(Long productoId);

}
