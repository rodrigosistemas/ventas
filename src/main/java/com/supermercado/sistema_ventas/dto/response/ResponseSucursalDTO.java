package com.supermercado.sistema_ventas.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseSucursalDTO {

    private Long id;
    private String rs;
    private String nomComercial;
    private String direccion;

}
