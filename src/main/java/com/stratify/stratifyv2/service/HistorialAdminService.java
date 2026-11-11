package com.stratify.stratifyv2.service;

import com.stratify.stratifyv2.entity.HistorialAdminEntity;
import com.stratify.stratifyv2.repository.HistorialAdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class HistorialAdminService {

    @Autowired
    private HistorialAdminRepository historialAdminRepository;

    public List<HistorialAdminEntity> listar() {
        return historialAdminRepository.findAll();
    }

    public Optional<HistorialAdminEntity> obtenerPorId(Integer id) {
        return historialAdminRepository.findById(id);
    }

    public HistorialAdminEntity guardar(HistorialAdminEntity entity) {
        return historialAdminRepository.save(entity);
    }

    public void eliminar(Integer id) {
        historialAdminRepository.deleteById(id);
    }
}
