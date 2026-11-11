package com.stratify.stratifyv2.controller;

import com.stratify.stratifyv2.entity.UbicacionAlmacenEntity;
import com.stratify.stratifyv2.service.UbicacionAlmacenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/ubicacion_almacen")
public class UbicacionAlmacenController {

    @Autowired
    private UbicacionAlmacenService ubicacionAlmacenService;

    @GetMapping
    public List<UbicacionAlmacenEntity> listar() {
        return ubicacionAlmacenService.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UbicacionAlmacenEntity> obtenerPorId(@PathVariable Integer id) {
        return ubicacionAlmacenService.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public UbicacionAlmacenEntity guardar(@RequestBody UbicacionAlmacenEntity entity) {
        return ubicacionAlmacenService.guardar(entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        ubicacionAlmacenService.eliminar(id);
        return ResponseEntity.ok().build();
    }
}
