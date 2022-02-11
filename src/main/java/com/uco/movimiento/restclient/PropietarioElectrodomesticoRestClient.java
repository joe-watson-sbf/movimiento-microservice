package com.uco.movimiento.restclient;
import com.uco.movimiento.dto.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "servicio.propietarioelectrodomestico",url = "localhost:8081/propietario-electrodomestico")
public interface PropietarioElectrodomesticoRestClient {
	@GetMapping("/v1/{id}/propietario")
	PropietarioDTO findById(@PathVariable Integer id);
}
