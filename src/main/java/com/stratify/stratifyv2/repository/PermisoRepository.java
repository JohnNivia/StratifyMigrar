package com.stratify.stratifyv2.repository;

import com.stratify.stratifyv2.entity.PermisoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermisoRepository extends JpaRepository<PermisoEntity, String> {
}
