import static org.junit.Assert.*;

import Modelo.EstadoCelda;
import Modelo.EstadoCeldaOcupada;
import Modelo.EstadoCeldaVacia;
import org.junit.Test;

public class EstadoCeldaTest{
	@Test
	public void estadoCeldaVaciaCambiaAOcupadoTest(){
		EstadoCelda estado = new EstadoCeldaVacia();
		EstadoCelda estadosiguiente = new EstadoCeldaOcupada(null);

		estado = estado.ocupar(null);

		assertEquals(estadosiguiente.getClass(),estado.getClass());
	}
	@Test
	public void estadoCeldaOcupadaCambiaAVaciaTest(){
		EstadoCelda estado = new EstadoCeldaOcupada(null);
		EstadoCelda estadosiguiente = new EstadoCeldaVacia();

		estado = estado.vaciar();

		assertEquals(estadosiguiente.getClass(),estado.getClass());		
	}
}