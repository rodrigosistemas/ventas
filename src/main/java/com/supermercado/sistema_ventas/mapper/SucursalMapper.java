package com.supermercado.sistema_ventas.mapper;

import com.supermercado.sistema_ventas.dto.SucursalDTO;
import com.supermercado.sistema_ventas.model.entities.Sucursal;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SucursalMapper {

    SucursalMapper mapper = Mappers.getMapper(SucursalMapper.class);

    SucursalDTO sucursalToSucursalDTO(Sucursal sucursal);

    Sucursal sucursalDTOToSucursal(SucursalDTO sucursalDTO);

    @Mapping(target="id", ignore=true)
    void updateSucursalFromDto(SucursalDTO dto, @MappingTarget Sucursal sucursal);

}
