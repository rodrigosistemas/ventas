package com.supermercado.sistema_ventas.service;

import com.supermercado.sistema_ventas.dto.SucursalDTO;
import com.supermercado.sistema_ventas.mapper.SucursalMapper;
import com.supermercado.sistema_ventas.model.entities.Sucursal;
import com.supermercado.sistema_ventas.model.repository.ISucursalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SucursalServiceImpl implements ISucursalService {

    @Autowired
    private ISucursalRepository repository;

    @Override
    public Sucursal save(SucursalDTO sucursalDto) {
        Sucursal sucursal = SucursalMapper.mapper.sucursalDTOToSucursal(sucursalDto);
        repository.save(sucursal);
        return sucursal;
    }

    @Override
    public List<SucursalDTO> getAll() {
        List<Sucursal> sucursales = repository.findAll();
        List<SucursalDTO> sucursalesDtos = sucursales.stream()
                .map(sucursal -> SucursalMapper.mapper.sucursalToSucursalDTO(sucursal))
                .collect(Collectors.toList());
        return sucursalesDtos;
    }

    @Override
    public SucursalDTO getById(Long sucursalId) {
        Optional<Sucursal> sucursalOpt = repository.findById(sucursalId);
        if (sucursalOpt.isPresent()) {
            Sucursal sucursal = sucursalOpt.get(); // If a value is present then return the value
            return SucursalMapper.mapper.sucursalToSucursalDTO(sucursal);
        }
        return null;
        // Also can be represented in a functional way
    }

    @Override
    public Sucursal update(SucursalDTO sucursalDto, Long sucursalId) {
        return repository.findById(sucursalId)
                .map(existingSucursal -> {
                    // Mapper here
                    SucursalMapper.mapper.updateSucursalFromDto(sucursalDto, existingSucursal);

                    return repository.save(existingSucursal);
                }).orElseThrow(() -> new RuntimeException("Sucursal no encontrada con id: " +sucursalId));
    }

    @Override
    public void deleteById(Long sucursalId) {
        repository.deleteById(sucursalId);
    }

}
