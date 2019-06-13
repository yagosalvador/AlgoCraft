import static org.junit.Assert.*;
import org.junit.Test;

public class EstadoCeldaTest{
	@Test
	public void estadoCeldaVaciaCambiaAOcupadoTest(){
		EstadoCelda estado = new EstadoCeldaVacia();
		EstadoCelda estadosiguiente = new EstadoCeldaOcupada();

		estado = estado.ocupar();

		assertEquals(estadosiguiente.getClass(),estado.getClass());
	}
	@Test
	public void estadoCeldaOcupadaCambiaAVaciaTest(){
		EstadoCelda estado = new EstadoCeldaOcupada();
		EstadoCelda estadosiguiente = new EstadoCeldaVacia();

		estado = estado.vaciar();

		assertEquals(estadosiguiente.getClass(),estado.getClass());		
	}
}