public interface EstadoCelda{
	boolean ocupada();
	EstadoCelda vaciar();
	EstadoCelda ocupar(Object objeto);
	Object contenido();
}