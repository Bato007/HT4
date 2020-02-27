import java.time.temporal.TemporalAccessor;

/**
 * @author Orlando Cabrera 19943
 * @author Brandon Hernández 19376
 * @version 25/02/2020
 * @since 25/02/2020
 *
 * Encargado de realizar las operaciones con los nodos
 *
 * Extraido de: https://www.youtube.com/watch?v=8oCjWIJJI9c&t=419s
 **/
public class ListaDoble<E> extends AbstractList<E>{

	// Referencias de los elementos
	protected DobleNode<E> head, tail;

	/**
	 * Se encarga de crear un nueva lista doble
	 * @pre no hay objeto
	 * @pos hay un nuevo objeto tipo lista doble
	 */
	public ListaDoble(){
		head = tail = null;
		count = 0;
	}

	/**
	 * Se encarga de agregar un dato al final de la lista
	 * @pos se agrega un nuevo elemento a la listsa
	 * @param value dato que se agregara a la lista
	 */
	@Override
	public void add(E value) {
		if(count == 0){
		    head = new DobleNode<E>(value, head, null);
		    if(tail == null) tail = head;
        }else {
		    tail = new DobleNode<E>(value, null, tail);
		    if(head == null) head = tail;
        }
		count++;
	}

	/**
	 * Se encarga de eliminar y retornar el ultimo valor
	 * @pre la lista no debe de estar vacia
	 * @pos se elimina el ultimo elemento de la lista
	 * @return el valor eliminado
	 */
	@Override
	public E remove() {
		DobleNode<E> temp = tail;
        tail = tail.getPrevious();
		if(head == tail){
			head = null;
		}else {
			tail.setNext(null);
		}
		count--;
		return temp.data;
	}

	/**
	 * Se encarga de conseguir el tamañoñ de la lista
	 * @return el tamaño de la lista
	 */
	@Override
	public E peek() {
		return tail.data;
	}



}
