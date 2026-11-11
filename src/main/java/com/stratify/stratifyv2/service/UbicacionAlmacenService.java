package com.stratify.stratifyv2.service;

import com.stratify.stratifyv2.entity.UbicacionAlmacenEntity;
import com.stratify.stratifyv2.repository.UbicacionAlmacenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UbicacionAlmacenService {

    @Autowired
    private UbicacionAlmacenRepository ubicacionAlmacenRepository;

    public List<UbicacionAlmacenEntity> listar() {
        return ubicacionAlmacenRepository.findAll();
    }

    public Optional<UbicacionAlmacenEntity> obtenerPorId(Integer id) {
        return ubicacionAlmacenRepository.findById(id);
    }

    public UbicacionAlmacenEntity guardar(UbicacionAlmacenEntity entity) {
        return ubicacionAlmacenRepository.save(entity);
    }

    public void eliminar(Integer id) {
        ubicacionAlmacenRepository.deleteById(id);
    }
}
