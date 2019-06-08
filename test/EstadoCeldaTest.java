import static org.junit.Assert.*;
import org.junit.Test;

public class EstadoCeldaTest{
	@Test
	public estadoCeldaVaciaCambiaAOcupadoTest(){
		EstadoCelda estado = new EstadoCeldaVacia();
		EstadoCelda estadosiguiente = new EstadoCeldaOcupada();

		estado.siguienteEstado();

		assertEquals(estadosiguiente.getClass(),estado.getClass());
	}
	@Test
	public estadoCeldaOcupadaCambiaAVaciaTest(){
		EstadoCelda estado = new EstadoCeldaOcupada();
		EstadoCelda estadosiguiente = new EstadoCeldaVacia();

		estado.siguienteEstado();

		assertEquals(estadosiguiente.getClass(),estado.getClass());		
	}
}