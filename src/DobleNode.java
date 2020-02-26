/**
 *  @author Orlando Cabrera 19943
 *  @author Brandon Hernández 19376
 *  @version 25/02/2020
 *  @since 25/02/2020
 *
 * Es el nodo que apuntara al siguiente y anterior elemento
 * Extraido de: https://www.youtube.com/watch?v=8oCjWIJJI9c&t=419s
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
