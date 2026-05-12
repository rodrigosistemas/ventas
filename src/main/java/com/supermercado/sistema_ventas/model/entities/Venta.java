package com.supermercado.sistema_ventas.model.entities;

import com.supermercado.sistema_ventas.enums.EstadoVenta;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate fecha;
    private EstadoVenta estado;
    @ManyToOne
    private Sucursal sucursal;
    private BigDecimal total;

}
