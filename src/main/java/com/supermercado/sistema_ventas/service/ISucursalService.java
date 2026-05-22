package com.supermercado.sistema_ventas.service;

import com.supermercado.sistema_ventas.dto.SucursalDTO;
import com.supermercado.sistema_ventas.model.entities.Sucursal;

import java.util.List;

public interface ISucursalService {

    //Create
    Sucursal save(SucursalDTO sucursalDto);

    //Read
    List<SucursalDTO> getAll();

    // Read byId
    SucursalDTO getById(Long sucursalId);

    //Update
    Sucursal update(SucursalDTO sucursalDto, Long sucursalId);

    //Delete
    void deleteById(Long sucursalId);

}

