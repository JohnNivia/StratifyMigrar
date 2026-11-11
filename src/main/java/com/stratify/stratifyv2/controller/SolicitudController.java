package com.stratify.stratifyv2.controller;

import com.stratify.stratifyv2.entity.SolicitudEntity;
import com.stratify.stratifyv2.service.SolicitudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/solicitud")
public class SolicitudController {

    @Autowired
    private SolicitudService solicitudService;

    @GetMapping
    public List<SolicitudEntity> listar() {
        return solicitudService.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<SolicitudEntity> obtenerPorId(@PathVariable Integer id) {
        return solicitudService.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public SolicitudEntity guardar(@RequestBody SolicitudEntity entity) {
        return solicitudService.guardar(entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        solicitudService.eliminar(id);
        return ResponseEntity.ok().build();
    }
}
