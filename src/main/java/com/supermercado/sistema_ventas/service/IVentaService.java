package com.supermercado.sistema_ventas.service;

import com.supermercado.sistema_ventas.dto.request.RequestVentaDTO;
import com.supermercado.sistema_ventas.dto.response.ResponseVentaDTO;
import com.supermercado.sistema_ventas.model.entities.Venta;

import java.util.List;

public interface IVentaService {

    //Create
    Venta save(RequestVentaDTO requestVentaDTO);

    //Read
    List<ResponseVentaDTO> getAll();

    //Read byId
    ResponseVentaDTO getById(Long ventaId);

    //Update
    Venta update(RequestVentaDTO requestVentaDTO, Long ventaId);

    //Delete
    void delete(Long ventaId);

}
