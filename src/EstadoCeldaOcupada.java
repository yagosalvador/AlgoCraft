public class EstadoCeldaOcupada implements EstadoCelda{
	@Override
	public boolean ocupada(){
		return true;
	}
	@Override 
	public EstadoCelda siguienteEstado(){
		return new EstadoCeldaVacia();
	}
}