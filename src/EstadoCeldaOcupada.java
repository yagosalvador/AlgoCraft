public class EstadoCeldaOcupada implements EstadoCelda{
	private Object contenido;

	public EstadoCeldaOcupada(Object objeto){
		contenido = objeto;
	}
	@Override
	public boolean ocupada(){
		return true;
	}
	@Override
	public EstadoCelda ocupar(Object objeto){
		return this;
	}
	@Override
	public EstadoCelda vaciar(){
		return new EstadoCeldaVacia();
	}
	@Override
	public Object contenido(){
		return contenido;
	}
}