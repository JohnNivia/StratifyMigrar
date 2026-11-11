package com.stratify.stratifyv2.controller;

import com.stratify.stratifyv2.entity.PermisoEntity;
import com.stratify.stratifyv2.service.PermisoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/permiso")
public class PermisoController {

    @Autowired
    private PermisoService permisoService;

    @GetMapping
    public List<PermisoEntity> listar() {
        return permisoService.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PermisoEntity> obtenerPorId(@PathVariable String id) {
        return permisoService.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public PermisoEntity guardar(@RequestBody PermisoEntity entity) {
        return permisoService.guardar(entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable String id) {
        permisoService.eliminar(id);
        return ResponseEntity.ok().build();
    }
}
