package com.stratify.stratifyv2.repository;

import com.stratify.stratifyv2.entity.HistorialCambiosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistorialCambiosRepository extends JpaRepository<HistorialCambiosEntity, Integer> {
}
