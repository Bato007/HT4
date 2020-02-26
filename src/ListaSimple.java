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
	  
	@Override
	public E peek() {
		// pre: list is not empty
		  // post: returns first value in list
		  {
		      return head.value();
		  }
	}

	@Override
	public void add(E value) 
		// post: adds value to end of list
		  {
		      // location for new value
		      Node<E> temp = new Node<E>(value,null);
		      if (head != null)
		     {
		         // pointer to possible tail
		         Node<E> finger = head;
		         while (finger.next() != null)
		         {
		                finger = finger.next();
		         }
				 
		         finger.setNext(temp);
		      } else head = temp;
			  
			  count++;
			  
		   }

	@Override
	public E remove() {
		// TODO Auto-generated method stub
		
		     Node<E> temp = head;
		     head = head.next(); // move head down list
		     count--;
		     return temp.value();
		  }
	}
