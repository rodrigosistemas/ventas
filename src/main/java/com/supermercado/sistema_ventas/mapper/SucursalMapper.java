package com.supermercado.sistema_ventas.mapper;

import com.supermercado.sistema_ventas.dto.request.RequestSucursalDTO;
import com.supermercado.sistema_ventas.dto.response.ResponseSucursalDTO;
import com.supermercado.sistema_ventas.model.entities.Sucursal;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SucursalMapper {

    SucursalMapper mapper = Mappers.getMapper(SucursalMapper.class);

    ResponseSucursalDTO sucursalToSucursalDTO(Sucursal sucursal);

    Sucursal sucursalDTOToSucursal(RequestSucursalDTO requestSucursalDTO);

    @Mapping(target="id", ignore=true)
    void updateSucursalFromDto(RequestSucursalDTO dto, @MappingTarget Sucursal sucursal);

}
