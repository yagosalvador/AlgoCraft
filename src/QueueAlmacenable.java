import java.util.LinkedList;
import java.util.Queue;

public class QueueAlmacenable{
	private Queue<Almacenable> q = new LinkedList<>();

	public void agregarElemento(Almacenable almacenable){
		q.add(almacenable);
	}

	public Almacenable usarElemento(){
		return q.peek();
	}

	public Almacenable sacarElemento(){
		return q.remove();
		//return q.poll();
		//poll se puede usar igual, ambos devuelven y sacan head
		//remove() devuelve excepcion si vacio
		//poll() devuelve null
	}

	public int size(){
		return q.size();
	}

	public int devolverDurabilidad(){
		return q.peek().durabilidad();
	}

}