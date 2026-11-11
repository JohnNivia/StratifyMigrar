package com.stratify.stratifyv2.repository;

import com.stratify.stratifyv2.entity.UnidadMedidaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnidadMedidaRepository extends JpaRepository<UnidadMedidaEntity, Integer> {
}
