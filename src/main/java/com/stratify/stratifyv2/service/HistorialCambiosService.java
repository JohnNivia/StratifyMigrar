package com.stratify.stratifyv2.service;

import com.stratify.stratifyv2.entity.HistorialCambiosEntity;
import com.stratify.stratifyv2.repository.HistorialCambiosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class HistorialCambiosService {

    @Autowired
    private HistorialCambiosRepository historialCambiosRepository;

    public List<HistorialCambiosEntity> listar() {
        return historialCambiosRepository.findAll();
    }

    public Optional<HistorialCambiosEntity> obtenerPorId(Integer id) {
        return historialCambiosRepository.findById(id);
    }

    public HistorialCambiosEntity guardar(HistorialCambiosEntity entity) {
        return historialCambiosRepository.save(entity);
    }

    public void eliminar(Integer id) {
        historialCambiosRepository.deleteById(id);
    }
}
