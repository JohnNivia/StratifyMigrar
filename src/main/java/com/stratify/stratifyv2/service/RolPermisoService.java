package com.stratify.stratifyv2.service;

import com.stratify.stratifyv2.entity.RolPermisoEntity;
import com.stratify.stratifyv2.repository.RolPermisoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class RolPermisoService {

    @Autowired
    private RolPermisoRepository rolPermisoRepository;

    public List<RolPermisoEntity> listar() {
        return rolPermisoRepository.findAll();
    }

    public Optional<RolPermisoEntity> obtenerPorId(String id) {
        return rolPermisoRepository.findById(id);
    }

    public RolPermisoEntity guardar(RolPermisoEntity entity) {
        return rolPermisoRepository.save(entity);
    }

    public void eliminar(String id) {
        rolPermisoRepository.deleteById(id);
    }
}
