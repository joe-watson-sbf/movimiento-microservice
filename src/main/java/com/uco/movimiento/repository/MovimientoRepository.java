package com.uco.movimiento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uco.movimiento.entity.MovimientoEntity;

@Repository
public interface MovimientoRepository extends JpaRepository< MovimientoEntity, Integer > {
    MovimientoEntity findById (int idMovimiento);
}
