package com.stratify.stratifyv2.service;

import com.stratify.stratifyv2.entity.SolicitudEntity;
import com.stratify.stratifyv2.repository.SolicitudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class SolicitudService {

    @Autowired
    private SolicitudRepository solicitudRepository;

    public List<SolicitudEntity> listar() {
        return solicitudRepository.findAll();
    }

    public Optional<SolicitudEntity> obtenerPorId(Integer id) {
        return solicitudRepository.findById(id);
    }

    public SolicitudEntity guardar(SolicitudEntity entity) {
        return solicitudRepository.save(entity);
    }

    public void eliminar(Integer id) {
        solicitudRepository.deleteById(id);
    }
}
