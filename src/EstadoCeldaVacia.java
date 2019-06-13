public class EstadoCeldaVacia implements EstadoCelda{
	@Override
	public boolean ocupada(){
		return false;
	}
	@Override
	public EstadoCelda ocupar(){
		return new EstadoCeldaOcupada();
	}
	@Override
	public EstadoCelda vaciar(){
		return this;
	}
}