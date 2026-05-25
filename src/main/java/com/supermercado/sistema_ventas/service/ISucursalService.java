package com.supermercado.sistema_ventas.service;

import com.supermercado.sistema_ventas.dto.request.RequestSucursalDTO;
import com.supermercado.sistema_ventas.dto.response.ResponseSucursalDTO;
import com.supermercado.sistema_ventas.model.entities.Sucursal;

import java.util.List;

public interface ISucursalService {

    //Create
    Sucursal save(RequestSucursalDTO requestSucursalDTO);

    //Read
    List<ResponseSucursalDTO> getAll();

    // Read byId
    ResponseSucursalDTO getById(Long sucursalId);

    //Update
    Sucursal update(RequestSucursalDTO requestSucursalDTO, Long sucursalId);

    //Delete
    void deleteById(Long sucursalId);

}

