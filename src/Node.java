/**
 * 
 */

/**
 * @author Orlando
 * @author Brandon Hernández 19376
 * @version 23/02/2020
 * @since 23/02/2020
 * @author Metodos sacados de la clase de "Listas encadenadass"
 *
 */
public class Node<E> {
	 protected E data; // value stored in this element
	   protected Node<E> nextElement; // ref to next

	   /**
	    * pre: v is a value, next is a reference to 
	    * remainder of list
	    * post: an element is constructed as the new head of list	   	  
	    * @param v
	    * @param next
	    */
	   public Node(E v, Node<E> next)
	   
	   {
	       data = v;
	       nextElement = next;
	   }

	   /**
	    * @post constructs a new tail of a list with value v
	    * @param v
	    */
	   public Node(E v)
	   
	   {
	      this(v,null);
	   }

	   /**
	    * @post: returns reference to next value in list
	    * @return Elemento siguiente
	    */
	   public Node<E> next()
	   
	   {
	      return nextElement;
	   }

	   /**
	    * @post: sets reference to new next value
	    * @param next
	    */
	   public void setNext(Node<E> next)
	   
	   {
	      nextElement = next;
	   }

	   /**
	    * @post: returns value associated with this element
	    */
	   public E value()
	   
	   {
	      return data;
	   }

	   /**
	    * @post: sets value associated with this element
	    * @param value
	    */
	   public void setValue(E value)
	   
	   {
	      data = value;
	   }
}
