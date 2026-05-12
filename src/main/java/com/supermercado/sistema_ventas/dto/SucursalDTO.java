package com.supermercado.sistema_ventas.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SucursalDTO {

    private Long id;
    private String rs;
    private String nomComercial;
    private String direccion;
    private int RUC;

}
