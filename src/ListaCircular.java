/**
 * @author Orlando Cabrera 19943
 * @author Brandon Hernández 19376
 * @author Metodos sacados de la clase de "Listas encadenadass"
 * @version 23/02/2020
 * @since 23/02/2020
 **/
public class ListaCircular<E> extends AbstractList<E>{
	protected Node<E> tail;
	protected int count;

	public ListaCircular()
	// pre: constructs a new circular list
	{
	   tail = null;
	   count = 0;
	}
	
	public void addFirst(E value)
	// pre: value non-null
	// post: adds element to head of list
	{
	   Node<E> temp = new Node<E>(value);
	   if (tail == null) { // first value added
	       tail = temp;
	       tail.setNext(tail);
	   } else { // element exists in list
	       temp.setNext(tail.next());
	       tail.setNext(temp);
	   }
	   count++;
	}
	/**
	 * Se encarga de agregar un dato al final de la lista
	 * @pos se agrega un nuevo elemento a la listsa
	 * @param value dato que se agregara a la lista
	 */

	@Override
	public void add(E value) {
		// pre: value non-null
		// post: adds element to tail of list
		
		   // new entry:
		   addFirst(value);
		   tail = tail.next();
		
		
	}
	/**
	 * Se encarga de eliminar y retornar el ultimo valor
	 * @pre la lista no debe de estar vacia
	 * @pos se elimina el ultimo elemento de la lista
	 * @return el valor eliminado
	 */

	@Override
	public E remove() 
	// pre: !isEmpty()
	// post: returns and removes value from tail of list
	{
	   Node<E> finger = tail;
	   while (finger.next() != tail) {
	       finger = finger.next();
	   }
	   // finger now points to second-to-last value
	   Node<E> temp = tail;
	   if (finger == tail)
	   {
	       tail = null;
	   } else {
	       finger.setNext(tail.next());
	       tail = finger;
	   }
	   count--;
	   return temp.value();
	}

	/**
	 * Se encarga de conseguir el ultimo dato ingresado a la lista
	 * @return el ultimo dato ingresado de la lista
	 */
	@Override
	public E peek() {
		// pre: list is not empty
		  // post: returns first value in list
		  {
		      return tail.value();
		  }
	}

}
