package com.stratify.stratifyv2.controller;

import com.stratify.stratifyv2.entity.HistorialCambiosEntity;
import com.stratify.stratifyv2.service.HistorialCambiosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/historial_cambios")
public class HistorialCambiosController {

    @Autowired
    private HistorialCambiosService historialCambiosService;

    @GetMapping
    public List<HistorialCambiosEntity> listar() {
        return historialCambiosService.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<HistorialCambiosEntity> obtenerPorId(@PathVariable Integer id) {
        return historialCambiosService.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public HistorialCambiosEntity guardar(@RequestBody HistorialCambiosEntity entity) {
        return historialCambiosService.guardar(entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        historialCambiosService.eliminar(id);
        return ResponseEntity.ok().build();
    }
}
