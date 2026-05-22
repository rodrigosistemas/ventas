package com.supermercado.sistema_ventas.controller;

import com.supermercado.sistema_ventas.dto.SucursalDTO;
import com.supermercado.sistema_ventas.model.entities.Sucursal;
import com.supermercado.sistema_ventas.service.ISucursalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class SucursalController {

    @Autowired
    private ISucursalService service;

    @PostMapping("/sucursales")
    public Sucursal saveSucursal(@RequestBody SucursalDTO sucursalDto) {
        return service.save(sucursalDto);
    }

    @GetMapping("/sucursales")
    public List<SucursalDTO> getAllSucursales() {
        return service.getAll();
    }

    @GetMapping("/sucursales/{id}")
    public SucursalDTO getSucusalById(@PathVariable("id") Long sucursalId) {
        return service.getById(sucursalId);
    }

    @PutMapping("/sucursales/{id}")
    public Sucursal updateSucursal(@RequestBody SucursalDTO sucursalDTO, @PathVariable("id") Long sucursalId) {
        return service.update(sucursalDTO, sucursalId);
    }

    @DeleteMapping("/sucursales/{id}")
    public String deleteSucursalById(@PathVariable("id") Long sucursalId) {
        service.deleteById(sucursalId);
        return "Sucursal eliminada correctamene";
    }

}
