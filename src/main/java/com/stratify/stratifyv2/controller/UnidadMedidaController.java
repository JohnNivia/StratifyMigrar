package com.stratify.stratifyv2.controller;

import com.stratify.stratifyv2.entity.UnidadMedidaEntity;
import com.stratify.stratifyv2.service.UnidadMedidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/unidad_medida")
public class UnidadMedidaController {

    @Autowired
    private UnidadMedidaService unidadMedidaService;

    @GetMapping
    public List<UnidadMedidaEntity> listar() {
        return unidadMedidaService.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UnidadMedidaEntity> obtenerPorId(@PathVariable Integer id) {
        return unidadMedidaService.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public UnidadMedidaEntity guardar(@RequestBody UnidadMedidaEntity entity) {
        return unidadMedidaService.guardar(entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        unidadMedidaService.eliminar(id);
        return ResponseEntity.ok().build();
    }
}
