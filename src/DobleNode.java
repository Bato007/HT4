/**
 *  @author Orlando Cabrera 19943
 *  @author Brandon Hernández 19376
 *  @version 25/02/2020
 *  @since 25/02/2020
 *
 * Es el nodo que apuntara al siguiente y anterior elemento
 * Extraido de: https://instructure-uploads.s3.us-east-1.amazonaws.com/account_111400000000000001/
 * attachments/10545/DoublyLinkedNode.java?response-content-disposition=inline%3B%20filename%3D%22DoublyLinkedNode.
 * java%22%3B%20filename%2A%3DUTF-8%27%27DoublyLinkedNode.java&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential
 * =AKIAJDW777BLV26JM2MQ%2F20200225%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20200225T231935Z&X-Amz-Expires=86400&X
 * -Amz-SignedHeaders=host&X-Amz-Signature=efd20b17e3967fda5d8460ea2330da9f462d6cb6544d0ef838a9cf202d5525c0
 */
public class DobleNode<E> {

    // Guardan la posicion del resto de los elementos y el  valor que contiene la lista
    protected E data;
    protected DobleNode<E> nextElement, previousElement;

    /**
     * Constructor de un nodo doble
     * @pos se crea un nuevo nodo doble
     * @param newData valor que se le quiere asignar
     */
    public DobleNode(E newData){
        this(newData, null, null);
    }

    /**
     * Constructor de un nodo doble
     * @pos se crea un nuevo nodo con valores siguientes, anteriores y un valor
     * @param newData el valor que se le quiere dar al nodo
     * @param next puntero al siguiente nodo
     * @param previous puntero al nodo anterior
     */
    public DobleNode(E newData, DobleNode<E> next, DobleNode<E> previous){
        data = newData;
        nextElement = next;

        if(nextElement != null){
            nextElement.previousElement = this;
        }

        previousElement = previous;

        if(previousElement != null){
            previousElement.nextElement = this;
        }
    }

}
