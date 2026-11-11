package com.stratify.stratifyv2.controller;

import com.stratify.stratifyv2.entity.RolEntity;
import com.stratify.stratifyv2.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/rol")
public class RolController {

    @Autowired
    private RolService rolService;

    @GetMapping
    public List<RolEntity> listar() {
        return rolService.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<RolEntity> obtenerPorId(@PathVariable Integer id) {
        return rolService.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public RolEntity guardar(@RequestBody RolEntity entity) {
        return rolService.guardar(entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        rolService.eliminar(id);
        return ResponseEntity.ok().build();
    }
}
