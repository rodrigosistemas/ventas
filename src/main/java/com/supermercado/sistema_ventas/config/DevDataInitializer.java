package com.supermercado.sistema_ventas.config;

import com.supermercado.sistema_ventas.enums.CategoriaProducto;
import com.supermercado.sistema_ventas.model.entities.Producto;
import com.supermercado.sistema_ventas.model.repository.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@Profile("test")
public class DevDataInitializer implements CommandLineRunner {

    @Autowired
    private IProductoRepository productoRepository;

    @Override
    public void run(String... args) throws Exception {  // Insert sample data
        productoRepository.save(new Producto(
                null,
                "Producto prueba",
                CategoriaProducto.ABARROTES,
                new BigDecimal("10.50")));
    }

}
