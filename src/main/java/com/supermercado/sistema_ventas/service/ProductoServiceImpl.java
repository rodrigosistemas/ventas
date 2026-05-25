package com.supermercado.sistema_ventas.service;

import com.supermercado.sistema_ventas.dto.ProductoDTO;
import com.supermercado.sistema_ventas.mapper.ProductoMapper;
import com.supermercado.sistema_ventas.model.entities.Producto;
import com.supermercado.sistema_ventas.model.repository.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductoServiceImpl implements IProductoService {

    @Autowired
    private IProductoRepository repository;

    @Override
    public Producto save(ProductoDTO productoDTO) {
        Producto producto = ProductoMapper.mapper.productoDTOToProducto(productoDTO);
        repository.save(producto);
        return producto;
    }

    @Override
    public List<ProductoDTO> getAll() {
        List<Producto> productos = repository.findAll();
        List<ProductoDTO> productoDTOS = productos.stream()
                .map(producto -> ProductoMapper.mapper.productoToProductDTO(producto))
                .collect(Collectors.toList());
        return productoDTOS;
    }

    @Override
    public ProductoDTO getById(Long productoId) {
        Optional<Producto> productoOpt = repository.findById(productoId);
        if (productoOpt.isPresent()) {
            Producto producto = productoOpt.get(); // If a value is present then return the value
            return ProductoMapper.mapper.productoToProductDTO(producto);
        }
        return null;
        // Also can be represented in a functional way
    }

    @Override
    public Producto update(ProductoDTO productoDTO, Long productoId) {
        return repository.findById(productoId)
                .map(existingProducto -> {
                    // Mapper here
                    ProductoMapper.mapper.updateProductoFromDto(productoDTO, existingProducto);

                    return repository.save(existingProducto);
                }).orElseThrow(() -> new RuntimeException("Producto no encontrado con id: " + productoId));
    }

    @Override
    public void deleteById(Long productoId) {
        repository.deleteById(productoId);
    }
}
