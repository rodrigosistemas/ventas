package com.supermercado.sistema_ventas.dto;

import com.supermercado.sistema_ventas.enums.CategoriaProducto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductoDTO {

    private Long id;
    private String nombre;
    private CategoriaProducto categoriaProducto;
    private BigDecimal precioActual;

}
