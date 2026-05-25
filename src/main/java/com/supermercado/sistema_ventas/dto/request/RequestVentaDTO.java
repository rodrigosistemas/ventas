package com.supermercado.sistema_ventas.dto.request;

import com.supermercado.sistema_ventas.enums.EstadoVenta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestVentaDTO {

    private Long id;
    private LocalDate fecha;
    private EstadoVenta estado;
    private Long idSucursal;
    private BigDecimal total;

}
