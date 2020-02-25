/**
 * @author Orlando Cabrera 19943
 * @author Brandon Hernández 19376
 * @version 25/02/2020
 * @since 25/02/2020
 *
 * Encargado de realizar las operaciones con los nodos
 *
 * Extraido de: https://instructure-uploads.s3.us-east-1.amazonaws.com/account_111400000000000001/
 * attachments/10546/DoubleLinkedList.java?response-content-disposition=inline%3B%20filename%3D%22
 * DoubleLinkedList.java%22%3B%20filename%2A%3DUTF-8%27%27DoubleLinkedList.java&X-Amz-Algorithm=AWS4
 * -HMAC-SHA256&X-Amz-Credential=AKIAJDW777BLV26JM2MQ%2F20200225%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-
 * Date=20200225T231250Z&X-Amz-Expires=86400&X-Amz-SignedHeaders=host&X-Amz-Signature=8faccbfe004e4747e
 * 1d105389f6477160a7a0c8779bee2db9726de94c1b00945
 **/
public class ListaDoble<E> extends AbstractList<E>{

	// Referencias de los elementos
	protected DobleNode<E> head, tail;

	/**
	 * @pre
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
		tail = new DobleNode<E>(value, null, null);

		if (head == null){
			head = tail;
		}
	}

	/**
	 * Se encarga de eliminar y retornar el ultimo valor
	 * @pre la lista no debe de estar vacia
	 * @pos se elimina el ultimo elemento de la lista
	 * @return el valor eliminado
	 */
	@Override
	public E remove() {
		E temp = tail.data;
		if (head == tail){
			head = tail = null;
		}else {
			head = head.nextElement;
			head.nextElement = null;
		}

		return temp;
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
