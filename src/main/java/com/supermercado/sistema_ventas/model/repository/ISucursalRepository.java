package com.supermercado.sistema_ventas.model.repository;

import com.supermercado.sistema_ventas.model.entities.Sucursal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISucursalRepository extends JpaRepository<Sucursal, Long> {
}
