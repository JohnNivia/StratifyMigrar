package com.stratify.stratifyv2.service;

import com.stratify.stratifyv2.entity.InventarioEntity;
import com.stratify.stratifyv2.repository.InventarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class InventarioService {

    @Autowired
    private InventarioRepository inventarioRepository;

    public List<InventarioEntity> listar() {
        return inventarioRepository.findAll();
    }

    public Optional<InventarioEntity> obtenerPorId(Integer id) {
        return inventarioRepository.findById(id);
    }

    public InventarioEntity guardar(InventarioEntity entity) {
        return inventarioRepository.save(entity);
    }

    public void eliminar(Integer id) {
        inventarioRepository.deleteById(id);
    }
}
