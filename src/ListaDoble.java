import java.time.temporal.TemporalAccessor;

/**
 * @author Orlando Cabrera 19943
 * @author Brandon Hernández 19376
 * @author Metodos sacados de la clase de "Listas encadenadass"
 * @version 25/02/2020
 * @since 25/02/2020
 *
 * Encargado de realizar las operaciones con los nodos
 *
 * 
 **/
public class ListaDoble<E> extends AbstractList<E>{
	protected int count;
	protected DobleNode<E> head;
	protected DobleNode<E> tail;
	
	public ListaDoble()
	// post: constructs an empty list
	{
	   head = null;
	   tail = null;
	   count = 0;
	}
	/**
	 *  @pre: la lista no esta vacia
	 *  @post: devuelve el ultimo valor ingresado de la lista
	 */
	@Override
	public E peek() {
		
		  {
		      return head.value();
		  }
	}
	/**
	 * @pre: value is not null
	 * @post: adds new value to tail of list
	 */

	@Override
	public void add(E value) {
		
		{
		   // construct new element
		   tail = new DobleNode<E>(value, null, tail);
		   // fix up head
		   if (head == null) head = tail;
		   count++;
		}
		
	}
	/**
	 * @pre: list is not empty
	 * @post: removes value from tail of list
	 */

	@Override
	public E remove() 
	
	{
	   DobleNode<E> temp = tail;
	   tail = tail.previousElement;
	   if (tail == null) {
	       head = null;
	   } else {
	       tail.setNext(null);
	   }
	   count--;
	   return temp.value();
	}
	


}
