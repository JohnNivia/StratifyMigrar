package com.stratify.stratifyv2.service;

import com.stratify.stratifyv2.entity.TipoDocumentoEntity;
import com.stratify.stratifyv2.repository.TipoDocumentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TipoDocumentoService {

    @Autowired
    private TipoDocumentoRepository tipoDocumentoRepository;

    public List<TipoDocumentoEntity> listar() {
        return tipoDocumentoRepository.findAll();
    }

    public Optional<TipoDocumentoEntity> obtenerPorId(Integer id) {
        return tipoDocumentoRepository.findById(id);
    }

    public TipoDocumentoEntity guardar(TipoDocumentoEntity entity) {
        return tipoDocumentoRepository.save(entity);
    }

    public void eliminar(Integer id) {
        tipoDocumentoRepository.deleteById(id);
    }
}
