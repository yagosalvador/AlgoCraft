public class EstadoCeldaOcupada implements EstadoCelda{
	@Override
	public boolean ocupada(){
		return true;
	}
	@Override
	public EstadoCelda ocupar(){
		return this;
	}
	@Override
	public EstadoCelda vaciar(){
		return new EstadoCeldaVacia();
	}
}