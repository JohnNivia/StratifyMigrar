package com.stratify.stratifyv2.repository;

import com.stratify.stratifyv2.entity.SolicitudEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SolicitudRepository extends JpaRepository<SolicitudEntity, Integer> {
}
