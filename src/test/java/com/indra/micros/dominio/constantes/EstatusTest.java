package com.indra.micros.dominio.constantes;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class EstatusTest {

	@Mock
	Estatus estatus;
	
	@Test
	void whenEstatusCARGADO_then_ok() {
		System.out.println(estatus.CARGADO);
		assertEquals(estatus.CARGADO.toString(), "CARGADO");
	}
	
	
}