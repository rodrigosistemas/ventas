package com.supermercado.sistema_ventas.controller;

import com.supermercado.sistema_ventas.dto.request.RequestVentaDTO;
import com.supermercado.sistema_ventas.dto.response.ResponseVentaDTO;
import com.supermercado.sistema_ventas.model.entities.Venta;
import com.supermercado.sistema_ventas.service.IVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class VentaController {

    @Autowired
    private IVentaService service;

    @PostMapping("/ventas")
    public ResponseVentaDTO saveVenta(@RequestBody RequestVentaDTO requestVentaDTO) {
        return service.save(requestVentaDTO);
    }

}
