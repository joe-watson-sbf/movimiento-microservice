package com.uco.movimiento.fabrica;

import com.uco.movimiento.dto.PropietarioDTO;
import com.uco.movimiento.entity.MovimientoEntity;
import com.uco.movimiento.model.Movimiento;
import com.uco.movimiento.model.Propietario;
import com.uco.movimiento.model.businessexception.BusinessException;
import com.uco.persona.command.MovimientoCommand;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MovimientoFabrica {

	public List<MovimientoCommand> entityToCommand(List<MovimientoEntity> listaPersonaEntity) {
		List<MovimientoCommand> listaMovimientoCommand = new ArrayList<>();
		listaPersonaEntity.forEach(e -> listaMovimientoCommand.add(entityToCommand(e)));
		return listaMovimientoCommand;
	}

	public MovimientoCommand entityToCommand(MovimientoEntity movimientoEntity) {
		MovimientoCommand movimientoCommand = new MovimientoCommand();
		movimientoCommand.setIdMovimiento(movimientoEntity.getIdMovimiento());
		movimientoCommand.setSerial(movimientoEntity.getTipoElectrodomestico());
		movimientoCommand.setObservacion(movimientoEntity.getMarca());
		movimientoCommand.setTipoElectrodomestico(movimientoEntity.getSerial());
		movimientoCommand.setMarca(movimientoEntity.getObservacion());
		movimientoCommand.setDiagnosticoTecnico(movimientoEntity.getDiagnosticoTecnico());
		movimientoCommand.setIdentificacion(movimientoEntity.getIdentificacion());
		return movimientoCommand;
	}

	public MovimientoEntity commandToEntity(MovimientoCommand movimientoCommand) {
		MovimientoEntity movimientoEntity = new MovimientoEntity();
		movimientoEntity.setSerial(movimientoCommand.getSerial());
		movimientoEntity.setObservacion(movimientoCommand.getObservacion());
		movimientoEntity.setTipoElectrodomestico(movimientoCommand.getTipoElectrodomestico());
		movimientoEntity.setMarca(movimientoCommand.getObservacion());
		movimientoEntity.setDiagnosticoTecnico(movimientoCommand.getDiagnosticoTecnico());
		movimientoEntity.setIdentificacion(movimientoCommand.getIdentificacion());
		return movimientoEntity;
	}

	public Movimiento entityToModel(MovimientoEntity movimientoEntity, PropietarioDTO propietarioDTO)
			throws BusinessException {
		Propietario propietario = new Propietario.PropietarioBuilder()
				.setIdentificacion(propietarioDTO.getIdentificacion())
				.setNombrePropietario(propietarioDTO.getNombrePropietario()).setCorreo(propietarioDTO.getCorreo())
				.setFechaInicio(propietarioDTO.getFechaInicio()).setTelefono(propietarioDTO.getTelefono()).build();
		Movimiento movimiento = new Movimiento.MovimientoBuilder().setIdMovimiento(movimientoEntity.getIdMovimiento())
				.setSerial(movimientoEntity.getSerial()).setDiagnosticoTecnico(movimientoEntity.getDiagnosticoTecnico())
				.setFechaEntranda(movimientoEntity.getFechaIngreso()).setFechaSalida(movimientoEntity.getFechaSalida())
				.setMarca(movimientoEntity.getMarca()).setObservacion(movimientoEntity.getObservacion()).setIdentificacion(movimientoEntity.getIdentificacion()).setPropietario(propietario).build();
		return movimiento;

	}

}
