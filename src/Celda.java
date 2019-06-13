public class Celda{
	private Object contenido;
	private EstadoCelda estado;

	public Celda(){
		contenido = null;
		estado = new EstadoCeldaVacia();
	}
	public Celda(Object objeto){
		contenido = objeto;
		estado = new EstadoCeldaOcupada();
	}
	public boolean ocupada(){
		return estado.ocupada();
	}

	public void ocupar(Object objeto){
		contenido = objeto;
		estado = estado.ocupar();
	}

	public void vaciar(){
		contenido = null;
		estado = estado.vaciar();
	}

	public Object contenido() {
		return contenido;
	}
}