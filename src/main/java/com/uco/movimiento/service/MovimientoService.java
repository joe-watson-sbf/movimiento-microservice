package com.uco.movimiento.service;

import com.uco.movimiento.entity.MovimientoEntity;
import com.uco.movimiento.model.Movimiento;
import com.uco.movimiento.model.businessexception.BusinessException;
import com.uco.persona.command.MovimientoCommand;

import java.util.List;

public interface MovimientoService {

    List<MovimientoCommand> findAll();

    Movimiento registrarMovimiento(MovimientoCommand movimientoCommand) throws BusinessException;

    MovimientoCommand findById(int idMovimiento);
}
