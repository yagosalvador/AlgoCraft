public interface EstadoCelda{
	public boolean ocupada();
	public EstadoCelda vaciar();
	public EstadoCelda ocupar(Object objeto);
	public Object contenido();
}