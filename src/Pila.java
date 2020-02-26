/**
 * @author Orlando
 * @author Brandon Hernández 19376
 * @version 23/02/2020
 * @since 23/02/2020
 *
 * Contrato de una pila
 */
public interface Pila<E> {

    /**
     * Se encarga de agregar un valor al final de la lisa
     * @pos se agrega un nuevo valor a la pila
     * @param value valor que se quiere agregar
     */
    public void add(E value);

    /**
     * Se encarga de eliminar al primer elemento de la lista
     * @pre la pila debe de tener al menos un valor
     * @pos se le quita un valor a la pila
     * @return el valor eliminado
     */
    public E remove();
    /**
     * Se encarga de mostrar el ultimo valor ingresado
     * @pre la pila debe de tener al menos un valor
     * @pos muestra el ultimo valor
     * @return el ultimo valor ingresado a la pila
     */
    public E peek();
}
