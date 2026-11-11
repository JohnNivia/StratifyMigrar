package com.stratify.stratifyv2.service;

import com.stratify.stratifyv2.entity.UnidadMedidaEntity;
import com.stratify.stratifyv2.repository.UnidadMedidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UnidadMedidaService {

    @Autowired
    private UnidadMedidaRepository unidadMedidaRepository;

    public List<UnidadMedidaEntity> listar() {
        return unidadMedidaRepository.findAll();
    }

    public Optional<UnidadMedidaEntity> obtenerPorId(Integer id) {
        return unidadMedidaRepository.findById(id);
    }

    public UnidadMedidaEntity guardar(UnidadMedidaEntity entity) {
        return unidadMedidaRepository.save(entity);
    }

    public void eliminar(Integer id) {
        unidadMedidaRepository.deleteById(id);
    }
}
