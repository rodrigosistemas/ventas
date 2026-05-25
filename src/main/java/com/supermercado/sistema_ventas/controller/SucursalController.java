package com.supermercado.sistema_ventas.controller;

import com.supermercado.sistema_ventas.dto.request.RequestSucursalDTO;
import com.supermercado.sistema_ventas.dto.response.ResponseSucursalDTO;
import com.supermercado.sistema_ventas.model.entities.Sucursal;
import com.supermercado.sistema_ventas.service.ISucursalService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class SucursalController {

    @Autowired
    private ISucursalService service;

    @PostMapping("/sucursales")
    public Sucursal saveSucursal(@RequestBody RequestSucursalDTO requestSucursalDTO) {
        return service.save(requestSucursalDTO);
    }

    @GetMapping("/sucursales")
    public List<ResponseSucursalDTO> getAllSucursales() {
        return service.getAll();
    }

    @GetMapping("/sucursales/{id}")
    public ResponseSucursalDTO getSucusalById(@PathVariable("id") Long sucursalId) {
        return service.getById(sucursalId);
    }

    @PutMapping("/sucursales/{id}")
    public Sucursal updateSucursal(@Valid @RequestBody RequestSucursalDTO requestSucursalDTO, @PathVariable("id") Long sucursalId) {
        return service.update(requestSucursalDTO, sucursalId);
    }

    @DeleteMapping("/sucursales/{id}")
    public String deleteSucursalById(@PathVariable("id") Long sucursalId) {
        service.deleteById(sucursalId);
        return "Sucursal eliminada correctamente";
    }

}
