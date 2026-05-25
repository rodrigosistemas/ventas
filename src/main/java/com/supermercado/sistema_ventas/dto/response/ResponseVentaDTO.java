package com.supermercado.sistema_ventas.dto.response;

import com.supermercado.sistema_ventas.dto.DetalleVentaDTO;
import com.supermercado.sistema_ventas.enums.EstadoVenta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseVentaDTO {

    private Long id;
    private LocalDate fecha;
    private EstadoVenta estado;
    private Long idSucursal;
    List<DetalleVentaDTO> detalle;
    private BigDecimal total;

}
