package com.stratify.stratifyv2.service;

import com.stratify.stratifyv2.entity.Rol;
import com.stratify.stratifyv2.repository.RolRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class  RolService {

    private final RolRepository repository;
    public RolService(RolRepository repository){
        this.repository = repository;
    }

    public List<Rol> listar(){
        return repository.findAll();
    }

    public Rol guardar(Rol rol){
        return repository.save(rol);
    }
}