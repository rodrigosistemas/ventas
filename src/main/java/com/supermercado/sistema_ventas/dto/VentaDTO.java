package com.supermercado.sistema_ventas.dto;

import com.supermercado.sistema_ventas.enums.EstadoVenta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VentaDTO {

    private Long id;
    private LocalDate fecha;
    private EstadoVenta estado;
    private int idSucursal;
    private BigDecimal total;

}
