package com.insoft.persona;

import com.uco.movimiento.model.Movimiento;
import com.uco.movimiento.model.businessexception.BusinessException;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MovimientTest {
/*
    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    public void crearPersonaConTipoDocumentoNulo() throws Exception{
        exception.expect(BusinessException.class);
        exception.expectMessage(Movimiento.TIPO_DOCUMENTO_REQUERIDO);
        Movimiento persona = new Movimiento.MovimientoBuilder()
                .build();
    }

    @Test
    public void crearPersonaConTipoDocumentoVacio() throws Exception{
        exception.expect(BusinessException.class);
        exception.expectMessage(Movimiento.TIPO_DOCUMENTO_REQUERIDO);
        Movimiento persona = new Movimiento.MovimientoBuilder()
                .setTipoDocumento("")
                .build();
    }

    @Test
    public void crearPersonaConTipoDocumentoInvalido() throws Exception{
        exception.expect(BusinessException.class);
        exception.expectMessage(Movimiento.TIPO_DOCUMENTO_INVALIDO);
        Movimiento persona = new Movimiento.MovimientoBuilder()
                .setTipoDocumento("TI")
                .build();
    }

    @Test
    public void crearPersonaConDocumentoNulo() throws Exception{
        exception.expect(BusinessException.class);
        exception.expectMessage(Movimiento.NUMERO_DOCUMENTO_REQUERIDO);
        Movimiento persona = new Movimiento.MovimientoBuilder()
                .setIdPersona(1)
                .setTipoDocumento("CC")
                .build();
    }

    @Test
    public void crearPersonaConDocumentoVacio() throws Exception {
        exception.expect(BusinessException.class);
        exception.expectMessage(Movimiento.NUMERO_DOCUMENTO_REQUERIDO);
        Movimiento persona = new Movimiento.MovimientoBuilder()
                .setIdPersona(2)
                .setTipoDocumento("CC")
                .setNumeroDocumento("")
                .build();
    }

    @Test
    public void crearPersonaConNombreNulo() throws Exception{
        exception.expect(BusinessException.class);
        exception.expectMessage(Movimiento.NOMBRE_REQUERIDO);
        Movimiento persona = new Movimiento.MovimientoBuilder()
                .setIdPersona(3)
                .setTipoDocumento("CC")
                .setNumeroDocumento("1036405066")
                .build();
    }

    @Test
    public void crearPersonaConNombreVacio() throws Exception{
        exception.expect(BusinessException.class);
        exception.expectMessage(Movimiento.NOMBRE_REQUERIDO);
        Movimiento persona = new Movimiento.MovimientoBuilder()
                .setIdPersona(3)
                .setTipoDocumento("CC")
                .setNumeroDocumento("1036405066")
                .setNombre("")
                .build();
    }

    @Test
    public void crearPersonaConApellidoNulo() throws Exception{
        exception.expect(BusinessException.class);
        exception.expectMessage(Movimiento.APELLIDO_REQUERIDO);
        Movimiento persona = new Movimiento.MovimientoBuilder()
                .setIdPersona(4)
                .setTipoDocumento("CC")
                .setNumeroDocumento("1036405066")
                .setNombre("James")
                .build();
    }

    @Test
    public void crearPersonaConApellidoVacio() throws Exception{
        exception.expect(BusinessException.class);
        exception.expectMessage(Movimiento.APELLIDO_REQUERIDO);
        Movimiento persona = new Movimiento.MovimientoBuilder()
                .setIdPersona(5)
                .setTipoDocumento("CC")
                .setNumeroDocumento("1036405066")
                .setNombre("James")
                .setApellido("")
                .build();
    }

    @Test
    public void crearPersonaConCargooNulo() throws Exception{
        exception.expect(BusinessException.class);
        exception.expectMessage(Movimiento.CARGO_REQUERIDO);
        Movimiento persona = new Movimiento.MovimientoBuilder()
                .setIdPersona(6)
                .setTipoDocumento("CC")
                .setNumeroDocumento("1036405066")
                .setNombre("James")
                .setApellido("Quintero")
                .build();
    }

    @Test
    public void crearPersonaConCargoVacio() throws Exception{
        exception.expect(BusinessException.class);
        exception.expectMessage(Movimiento.CARGO_REQUERIDO);
        Movimiento persona = new Movimiento.MovimientoBuilder()
                .setIdPersona(7)
                .setTipoDocumento("CC")
                .setNumeroDocumento("1036405066")
                .setNombre("James")
                .setApellido("Quintero")
                .setCargo("")
                .build();
    }
*/
}
