package com.supermercado.sistema_ventas.model.repository;

import com.supermercado.sistema_ventas.model.entities.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVentaRepository extends JpaRepository<Venta, Long> {
}
