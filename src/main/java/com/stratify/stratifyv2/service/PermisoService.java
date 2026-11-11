package com.stratify.stratifyv2.service;

import com.stratify.stratifyv2.entity.PermisoEntity;
import com.stratify.stratifyv2.repository.PermisoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PermisoService {

    @Autowired
    private PermisoRepository permisoRepository;

    public List<PermisoEntity> listar() {
        return permisoRepository.findAll();
    }

    public Optional<PermisoEntity> obtenerPorId(String id) {
        return permisoRepository.findById(id);
    }

    public PermisoEntity guardar(PermisoEntity entity) {
        return permisoRepository.save(entity);
    }

    public void eliminar(String id) {
        permisoRepository.deleteById(id);
    }
}
