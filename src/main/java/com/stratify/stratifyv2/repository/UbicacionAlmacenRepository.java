package com.stratify.stratifyv2.repository;

import com.stratify.stratifyv2.entity.UbicacionAlmacenEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UbicacionAlmacenRepository extends JpaRepository<UbicacionAlmacenEntity, Integer> {
}
