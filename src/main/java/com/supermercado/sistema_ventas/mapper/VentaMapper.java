package com.supermercado.sistema_ventas.mapper;

import com.supermercado.sistema_ventas.dto.request.RequestVentaDTO;
import com.supermercado.sistema_ventas.dto.response.ResponseVentaDTO;
import com.supermercado.sistema_ventas.model.entities.Venta;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface VentaMapper {

    VentaMapper mapper = Mappers.getMapper(VentaMapper.class);

    ResponseVentaDTO ventaToVentaDTO(Venta venta);

    @Mapping(source = "idSucursal", target = "sucursal.id")
    Venta ventaDTOToVenta(RequestVentaDTO requestVentaDTO);

}
