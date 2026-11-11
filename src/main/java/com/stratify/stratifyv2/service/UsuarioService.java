package com.stratify.stratifyv2.service;

import com.stratify.stratifyv2.entity.UsuarioEntity;
import com.stratify.stratifyv2.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<UsuarioEntity> listar() {
        return usuarioRepository.findAll();
    }

    public Optional<UsuarioEntity> obtenerPorId(Integer id) {
        return usuarioRepository.findById(id);
    }

    public UsuarioEntity guardar(UsuarioEntity entity) {
        return usuarioRepository.save(entity);
    }

    public void eliminar(Integer id) {
        usuarioRepository.deleteById(id);
    }
}
