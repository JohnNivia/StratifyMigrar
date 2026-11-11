package com.stratify.stratifyv2.repository;

import com.stratify.stratifyv2.entity.HistorialAdminEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistorialAdminRepository extends JpaRepository<HistorialAdminEntity, Integer> {
}
