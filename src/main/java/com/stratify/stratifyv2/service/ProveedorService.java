package com.stratify.stratifyv2.service;

import com.stratify.stratifyv2.entity.ProveedorEntity;
import com.stratify.stratifyv2.repository.ProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProveedorService {

    @Autowired
    private ProveedorRepository proveedorRepository;

    public List<ProveedorEntity> listar() {
        return proveedorRepository.findAll();
    }

    public Optional<ProveedorEntity> obtenerPorId(Integer id) {
        return proveedorRepository.findById(id);
    }

    public ProveedorEntity guardar(ProveedorEntity entity) {
        return proveedorRepository.save(entity);
    }

    public void eliminar(Integer id) {
        proveedorRepository.deleteById(id);
    }
}
