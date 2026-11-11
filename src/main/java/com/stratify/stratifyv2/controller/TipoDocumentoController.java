package com.stratify.stratifyv2.controller;

import com.stratify.stratifyv2.entity.TipoDocumentoEntity;
import com.stratify.stratifyv2.service.TipoDocumentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/tipo_documento")
public class TipoDocumentoController {

    @Autowired
    private TipoDocumentoService tipoDocumentoService;

    @GetMapping
    public List<TipoDocumentoEntity> listar() {
        return tipoDocumentoService.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TipoDocumentoEntity> obtenerPorId(@PathVariable Integer id) {
        return tipoDocumentoService.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public TipoDocumentoEntity guardar(@RequestBody TipoDocumentoEntity entity) {
        return tipoDocumentoService.guardar(entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        tipoDocumentoService.eliminar(id);
        return ResponseEntity.ok().build();
    }
}
