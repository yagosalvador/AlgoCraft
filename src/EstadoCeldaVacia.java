public class EstadoCeldaVacia implements EstadoCelda{
	@Override
	public boolean ocupada(){
		return false;
	}
	@Override
	public EstadoCelda ocupar(Object objeto){
		return new EstadoCeldaOcupada(objeto);
	}
	@Override
	public EstadoCelda vaciar(){
		return this;
	}
	@Override
	public Object contenido(){
		return null;
	}
}