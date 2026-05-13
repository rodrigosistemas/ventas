package com.supermercado.sistema_ventas.config;

import com.supermercado.sistema_ventas.model.entities.Sucursal;
import com.supermercado.sistema_ventas.model.repository.ISucursalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DevDataInit implements CommandLineRunner {

    @Autowired
    private ISucursalRepository sucursalRepository;

    @Override
    public void run(String... args) throws Exception {
        sucursalRepository.save(new Sucursal(
                null,
                "Sucursal 1 - Razon Social",
                "Sucursal - Nombre comercial",
                "Dir",
                10203040601L
        ));
    }
}
