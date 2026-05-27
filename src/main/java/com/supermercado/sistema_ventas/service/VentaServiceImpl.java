package com.supermercado.sistema_ventas.service;

import com.supermercado.sistema_ventas.dto.request.RequestVentaDTO;
import com.supermercado.sistema_ventas.dto.response.ResponseVentaDTO;
import com.supermercado.sistema_ventas.mapper.VentaMapper;
import com.supermercado.sistema_ventas.mapper.VentaMapperImpl;
import com.supermercado.sistema_ventas.model.entities.Venta;
import com.supermercado.sistema_ventas.model.repository.IVentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VentaServiceImpl implements IVentaService {

    @Autowired
    private IVentaRepository repository;

    @Override
    public ResponseVentaDTO save(RequestVentaDTO requestVentaDTO) {
        // 1. Convert DTO to Entity for saving
        Venta venta = VentaMapper.mapper.ventaDTOToVenta(requestVentaDTO);
        // 2. Save sale in bd
        Venta ventaSaved = repository.save(venta);
        return VentaMapperImpl.mapper.ventaToVentaDTO(ventaSaved);
    }

    @Override
    public List<ResponseVentaDTO> getAll() {
        return List.of();
    }

    @Override
    public ResponseVentaDTO getById(Long ventaId) {
        return null;
    }

    @Override
    public Venta update(RequestVentaDTO requestVentaDTO, Long ventaId) {
        return null;
    }

    @Override
    public void delete(Long ventaId) {

    }
}
