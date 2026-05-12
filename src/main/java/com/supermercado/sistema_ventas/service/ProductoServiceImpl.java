package com.supermercado.sistema_ventas.service;

import com.supermercado.sistema_ventas.dto.ProductoDTO;
import com.supermercado.sistema_ventas.model.entities.Producto;
import com.supermercado.sistema_ventas.model.repository.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements IProductoService {

    @Autowired
    private IProductoRepository repository;

    @Override
    public Producto save(Producto producto) {
        return repository.save(producto);
    }

    @Override
    public List<Producto> getAll() {
        return repository.findAll();
    }

    @Override
    public Producto update(Producto producto, Long productoId) {
        return repository.findById(productoId)
                .map(existingProducto -> {
                    existingProducto.setNombre(producto.getNombre());
                    existingProducto.setCategoriaProducto(producto.getCategoriaProducto());
                    existingProducto.setPrecioActual(producto.getPrecioActual());
                    return repository.save(existingProducto);
                }).orElseThrow(() -> new RuntimeException("Producto no encontrado con id: " + productoId));
    }

    @Override
    public void delete(Long productoId) {
        repository.deleteById(productoId);
    }
}
