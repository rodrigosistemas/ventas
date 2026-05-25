package com.supermercado.sistema_ventas.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestSucursalDTO {

    private Long id;
    private String rs;
    private String nomComercial;
    private String direccion;
    @NotNull
    private String RUC;

}
