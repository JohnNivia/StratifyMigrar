package com.stratify.stratifyv2.controller;

import com.stratify.stratifyv2.entity.HistorialAdminEntity;
import com.stratify.stratifyv2.service.HistorialAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/historial_admin")
public class HistorialAdminController {

    @Autowired
    private HistorialAdminService historialAdminService;

    @GetMapping
    public List<HistorialAdminEntity> listar() {
        return historialAdminService.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<HistorialAdminEntity> obtenerPorId(@PathVariable Integer id) {
        return historialAdminService.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public HistorialAdminEntity guardar(@RequestBody HistorialAdminEntity entity) {
        return historialAdminService.guardar(entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        historialAdminService.eliminar(id);
        return ResponseEntity.ok().build();
    }
}
