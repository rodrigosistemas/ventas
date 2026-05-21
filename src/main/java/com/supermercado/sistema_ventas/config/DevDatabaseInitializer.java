package com.supermercado.sistema_ventas.config;

import com.supermercado.sistema_ventas.enums.CategoriaProducto;
import com.supermercado.sistema_ventas.model.entities.Producto;
import com.supermercado.sistema_ventas.model.entities.Sucursal;
import com.supermercado.sistema_ventas.model.repository.IProductoRepository;
import com.supermercado.sistema_ventas.model.repository.ISucursalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Arrays;

@Component
@Profile("dev")
public class DevDatabaseInitializer implements CommandLineRunner {

    @Autowired
    private ISucursalRepository sucursalRepository;

    @Autowired
    private IProductoRepository productoRepository;

    @Override
    public void run(String... args) throws Exception {

        // Insert sucursales
        sucursalRepository.saveAll(Arrays.asList(
                new Sucursal(null, "Supermercados Peruanos S.A.", "Plaza Vea - Miraflores", "Av. Arequipa 4651, Miraflores", "20100070970"),
                new Sucursal(null, "Cencosud Retail Peru S.A.", "Wong - San Isidro", "Ovalo Gutierrez S/N, San Isidro", "20109072177"),
                new Sucursal(null, "Hipermercados Tottus S.A.", "Tottus - Jockey Plaza", "Av. Javier Prado Este 4200, Surco", "20508565934")
        ));

        productoRepository.saveAll(Arrays.asList(
                new Producto(null, "Arroz Costeño Extra 1kg", CategoriaProducto.ABARROTES, new BigDecimal("4.50")),
                new Producto(null, "Aceite Primor Premium 1L", CategoriaProducto.ABARROTES, new BigDecimal("12.90")),
                new Producto(null, "Fideos Don Vittorio Spaghetti 500g", CategoriaProducto.ABARROTES, new BigDecimal("3.20")),
                new Producto(null, "Leche Evaporada Gloria Tarro 400g", CategoriaProducto.LACTEOS, new BigDecimal("3.80")),
                new Producto(null, "Inca Kola Botella Plástica 3L", CategoriaProducto.BEBIDAS, new BigDecimal("11.00")),
                new Producto(null, "Cerveza Cusqueña Trigo 620ml", CategoriaProducto.BEBIDAS, new BigDecimal("6.50")),
                new Producto(null, "Detergente Bolívar Cuidado Activo 1.5kg", CategoriaProducto.LIMPIEZA, new BigDecimal("15.90")),
                new Producto(null, "Panetón D'Onofrio Bolsa 900g", CategoriaProducto.ABARROTES, new BigDecimal("25.90")),
                new Producto(null, "Galletas Casino Menta 43g (Pack x6)", CategoriaProducto.ABARROTES, new BigDecimal("4.80")),
                new Producto(null, "Atun Florida Lomitos en Aceite 170g", CategoriaProducto.ABARROTES, new BigDecimal("5.50"))
        ));

    }

}
