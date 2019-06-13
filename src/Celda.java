public class Celda{
	private EstadoCelda estado;

	public Celda(){
		estado = new EstadoCeldaVacia();
	}
	public Celda(Object objeto){
		estado = new EstadoCeldaOcupada(objeto);
	}
	public boolean ocupada(){
		return estado.ocupada();
	}

	public void ocupar(Object objeto){
		estado = estado.ocupar(objeto);
	}

	public void vaciar(){
		estado = estado.vaciar();
	}

	public Object contenido() {
		return estado.contenido();
	}
}