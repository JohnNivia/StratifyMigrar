package com.stratify.stratifyv2.controller;

import com.stratify.stratifyv2.entity.RolPermisoEntity;
import com.stratify.stratifyv2.service.RolPermisoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/rol_permiso")
public class RolPermisoController {

    @Autowired
    private RolPermisoService rolPermisoService;

    @GetMapping
    public List<RolPermisoEntity> listar() {
        return rolPermisoService.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<RolPermisoEntity> obtenerPorId(@PathVariable String id) {
        return rolPermisoService.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public RolPermisoEntity guardar(@RequestBody RolPermisoEntity entity) {
        return rolPermisoService.guardar(entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable String id) {
        rolPermisoService.eliminar(id);
        return ResponseEntity.ok().build();
    }
}
