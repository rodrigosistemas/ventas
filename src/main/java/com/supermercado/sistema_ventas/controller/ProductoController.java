package com.supermercado.sistema_ventas.controller;

import com.supermercado.sistema_ventas.dto.ProductoDTO;
import com.supermercado.sistema_ventas.model.entities.Producto;
import com.supermercado.sistema_ventas.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ProductoController {

    @Autowired
    private IProductoService service;

    @PostMapping("/productos")
    public Producto saveProducto(@RequestBody ProductoDTO productoDto) {
        return service.save(productoDto);
    }

    @GetMapping("/productos")
    public List<ProductoDTO> getAllProductos() {
        return service.getAll();
    }

    @GetMapping("/productos/{id}")
    public ProductoDTO getProductoById(@PathVariable("id") Long productoId) {
        return service.getById(productoId);
    }

    @PutMapping("/productos/{id}")
    public Producto updateProducto(@RequestBody ProductoDTO productoDTO, @PathVariable("id") Long productoId) {
        return service.update(productoDTO, productoId);
    }

    @DeleteMapping("/productos/{id}")
    public String deleteProductoById(@PathVariable("id") Long productoId) {
        service.deleteById(productoId);
        return "Producto eliminado correctamente";
    }

}
