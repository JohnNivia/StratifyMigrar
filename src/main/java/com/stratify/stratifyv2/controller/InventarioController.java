package com.stratify.stratifyv2.controller;

import com.stratify.stratifyv2.entity.InventarioEntity;
import com.stratify.stratifyv2.service.InventarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/inventario")
public class InventarioController {

    @Autowired
    private InventarioService inventarioService;

    @GetMapping
    public List<InventarioEntity> listar() {
        return inventarioService.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<InventarioEntity> obtenerPorId(@PathVariable Integer id) {
        return inventarioService.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public InventarioEntity guardar(@RequestBody InventarioEntity entity) {
        return inventarioService.guardar(entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        inventarioService.eliminar(id);
        return ResponseEntity.ok().build();
    }
}
