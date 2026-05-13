package com.supermercado.sistema_ventas.service;

import com.supermercado.sistema_ventas.dto.SucursalDTO;
import com.supermercado.sistema_ventas.model.entities.Sucursal;

import java.util.List;

public interface ISucursalService {

    //Create
    Sucursal save(Sucursal sucursal);

    //Read
    List<Sucursal> getAll();

    // Read byId
    SucursalDTO getById();

    //Update
    Sucursal update(Sucursal sucursal, Long sucursalId);

    //Delete
    void delete(Long sucursalId);

}

