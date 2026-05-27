package com.supermercado.sistema_ventas.service;

import com.supermercado.sistema_ventas.dto.ProductoDTO;
import com.supermercado.sistema_ventas.model.entities.Producto;

import java.util.List;

public interface IProductoService {

    //Create
    ProductoDTO save(ProductoDTO productoDTO);

    //Read
    List<ProductoDTO> getAll();

    // Read byId
    ProductoDTO getById(Long productoId);

    //Update
    Producto update(ProductoDTO productoDTO, Long productoId);

    //Delete
    void deleteById(Long productoId);

}
