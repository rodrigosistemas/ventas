package com.supermercado.sistema_ventas.service;

import com.supermercado.sistema_ventas.dto.SucursalDTO;
import com.supermercado.sistema_ventas.model.entities.Sucursal;
import com.supermercado.sistema_ventas.model.repository.ISucursalRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SucursalServiceImpl implements ISucursalService {

    private ISucursalRepository repository;

    @Override
    public Sucursal save(Sucursal sucursal) {
        return repository.save(sucursal);
    }

    @Override
    public List<Sucursal> getAll() {
        return repository.findAll();
    }

    @Override
    public SucursalDTO getById() {
        return null;
    }

    @Override
    public Sucursal update(Sucursal sucursal, Long sucursalId) {
        return repository.findById(sucursalId)
                .map(existingSucursal -> {
                    existingSucursal.setRs(sucursal.getRs());
                    existingSucursal.setNomComercial(sucursal.getNomComercial());
                    existingSucursal.setDireccion(sucursal.getDireccion());
                    existingSucursal.setRUC(sucursal.getRUC());
                    return repository.save(existingSucursal);
                }).orElseThrow(() -> new RuntimeException("Sucursal no encontrada con id: " +sucursalId));
    }

    @Override
    public void delete(Long sucursalId) {
        repository.deleteById(sucursalId);
    }
}
