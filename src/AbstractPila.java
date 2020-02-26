/**
 * @author Orlando
 * @author Brandon Hernández 19376
 * @version 23/02/2020
 * @since 23/02/2020
 *
 * Implementación de una pila
 */
public abstract class AbstractPila<E> implements Pila<E>{

    /**
     * Se encarga de agregar un valor al final de la lisa
     * @pos se agrega un nuevo valor a la pila
     * @param value valor que se quiere agregar
     */
    @Override
    public void add(E value) {
        add(value);
    }

    /**
     * Se encarga de eliminar al primer elemento de la lista
     * @pre la pila debe de tener al menos un valor
     * @pos se le quita un valor a la pila
     * @return el valor eliminado
     */
    @Override
    public E remove() {
        return remove();
    }
    
}
