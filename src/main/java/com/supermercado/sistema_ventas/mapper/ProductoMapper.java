package com.supermercado.sistema_ventas.mapper;

import com.supermercado.sistema_ventas.model.entities.Producto;
import com.supermercado.sistema_ventas.dto.ProductoDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductoMapper {

    ProductoMapper mapper = Mappers.getMapper(ProductoMapper.class);

    ProductoDTO productoToProductDTO(Producto product);

    Producto productoDTOToProducto(ProductoDTO productoDTO);

    // Recomended by MapStruct
    void updateProductoFromDto(ProductoDTO dto, @MappingTarget Producto producto);

}
