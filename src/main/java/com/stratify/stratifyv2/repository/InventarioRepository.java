package com.stratify.stratifyv2.repository;

import com.stratify.stratifyv2.entity.InventarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventarioRepository extends JpaRepository<InventarioEntity, Integer> {
}
