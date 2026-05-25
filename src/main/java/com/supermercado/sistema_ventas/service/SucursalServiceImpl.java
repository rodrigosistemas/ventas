package com.supermercado.sistema_ventas.service;

import com.supermercado.sistema_ventas.dto.request.RequestSucursalDTO;
import com.supermercado.sistema_ventas.dto.response.ResponseSucursalDTO;
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
    public Sucursal save(RequestSucursalDTO requestSucursalDTO) {
        Sucursal sucursal = SucursalMapper.mapper.sucursalDTOToSucursal(requestSucursalDTO);
        repository.save(sucursal);
        return sucursal;
    }

    @Override
    public List<ResponseSucursalDTO> getAll() {
        List<Sucursal> sucursales = repository.findAll();
        List<ResponseSucursalDTO> sucursalesDtos = sucursales.stream()
                .map(sucursal -> SucursalMapper.mapper.sucursalToSucursalDTO(sucursal))
                .collect(Collectors.toList());
        return sucursalesDtos;
    }

    @Override
    public ResponseSucursalDTO getById(Long sucursalId) {
        Optional<Sucursal> sucursalOpt = repository.findById(sucursalId);
        if (sucursalOpt.isPresent()) {
            Sucursal sucursal = sucursalOpt.get(); // If a value is present then return the value
            return SucursalMapper.mapper.sucursalToSucursalDTO(sucursal);
        }
        return null;
        // Also can be represented in a functional way
    }

    @Override
    public Sucursal update(RequestSucursalDTO requestSucursalDTO, Long sucursalId) {
        return repository.findById(sucursalId)
                .map(existingSucursal -> {
                    // Mapper here
                    SucursalMapper.mapper.updateSucursalFromDto(requestSucursalDTO, existingSucursal);

                    return repository.save(existingSucursal);
                }).orElseThrow(() -> new RuntimeException("Sucursal no encontrada con id: " +sucursalId));
    }

    @Override
    public void deleteById(Long sucursalId) {
        repository.deleteById(sucursalId);
    }

}
