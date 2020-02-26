import java.time.temporal.TemporalAccessor;


/**
 *  @author Orlando Cabrera 19943
 *  @author Brandon Hernández 19376
 *  @version 25/02/2020
 *  @since 25/02/2020
 *
 * Es el nodo que apuntara al siguiente y anterior elemento
 * Extraido de: https://www.youtube.com/watch?v=8oCjWIJJI9c&t=419s
 */
public class DobleNode<E>
{
	protected E data;
	protected DobleNode<E> nextElement;
	protected DobleNode<E> previousElement;
	

	public DobleNode(E v,
			DobleNode<E> next,
			DobleNode<E> previous)
	{
		data = v;
		nextElement = next;
		if (nextElement != null)
			nextElement.previousElement = this;
		previousElement = previous;
		if (previousElement != null)
			previousElement.nextElement = this;
	}
	/**
	 * @post: constructs a single element
	 * @param v
	 */

	public DobleNode(E v)
	{
		this(v,null,null);
	}
	public void setNext(DobleNode<E> next)
	   
	   {
	      nextElement = next;
	   }
	public E value()
	   
	   {
	      return data;
	   }
}
