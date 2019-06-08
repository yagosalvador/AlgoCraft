public class EstadoCeldaVacia implements EstadoCelda{
	@Override
	public boolean ocupada(){
		return false;
	}
	@Override 
	public EstadoCelda siguienteEstado(){
		return new EstadoCeldaOcupada();
	}
}