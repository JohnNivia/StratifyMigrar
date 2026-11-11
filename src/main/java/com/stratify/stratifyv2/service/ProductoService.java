package com.stratify.stratifyv2.service;

import com.stratify.stratifyv2.entity.ProductoEntity;
import com.stratify.stratifyv2.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public List<ProductoEntity> listar() {
        return productoRepository.findAll();
    }

    public Optional<ProductoEntity> obtenerPorId(Integer id) {
        return productoRepository.findById(id);
    }

    public ProductoEntity guardar(ProductoEntity entity) {
        return productoRepository.save(entity);
    }

    public void eliminar(Integer id) {
        productoRepository.deleteById(id);
    }
}
