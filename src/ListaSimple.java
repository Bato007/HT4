/**
 * @author Orlando Cabrera 19943
 * @author Brandon Hernández 19376
 * @author Metodos sacados de la clase de "Listas encadenadass"
 * @version 23/02/2020
 * @since 23/02/2020
 **/
public class ListaSimple<E> extends AbstractList<E>{

	   protected int count; // list size
	   protected Node<E> head; // ref. to first element

	   public void SinglyLinkedList()
	   // post: generates an empty list
	   {
	      head = null;
	      count = 0;
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
		      return head.value();
		  }
	}
	/**
	 * Se encarga de agregar un dato al final de la lista
	 * @pos se agrega un nuevo elemento a la listsa
	 * @param value dato que se agregara a la lista
	 */

	@Override
	public void add(E value) 
	// post: value is added to beginning of list
	  {
	     // note order that things happen:
	     // head is parameter, then assigned
	     head = new Node<E>(value, head);
	     count++;
	  }
	/**
	 * Se encarga de eliminar y retornar el ultimo valor
	 * @pre la lista no debe de estar vacia
	 * @pos se elimina el ultimo elemento de la lista
	 * @return el valor eliminado
	 */

	@Override
	public E remove() 
	// pre: list is not empty
	  // post: removes and returns value from beginning of list
	 {
	     Node<E> temp = head;
	     head = head.next(); // move head down list
	     count--;
	     return temp.value();
	  }
	}
