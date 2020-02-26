/**
 * @author Orlando Cabrera 19943
 * @author Brandon Hernández 19376
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

	@Override
	public void add(E value) {
		// pre: value non-null
		// post: adds element to tail of list
		
		   // new entry:
		   addFirst(value);
		   tail = tail.next();
		
		
	}

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

	@Override
	public E peek() {
		// pre: list is not empty
		  // post: returns first value in list
		  {
		      return tail.value();
		  }
	}

}
