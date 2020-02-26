/**
 * 
 */

/**
 * @author Orlando
 * @author Brandon Hernández 19376
 * @version 25/02/2020
 * @since 23/02/2020
 *
 * Implementacion abstracta de una pila y una lista
 */
public abstract class AbstractList<E> implements Lista<E>,Pila<E>{

    // Numero de elementos que posee una lista
    protected int count;

    /**
     * Se encarga de agregar un dato al final de la lista
     * @pos se agrega un nuevo elemento a la listsa
     * @param value dato que se agregara a la lista
     */
    public abstract void add(E value);

    /**
     * Se encarga de eliminar y retornar el ultimo valor ingresado
     * @pre la lista no debe de estar vacia
     * @pos se elimina el ultimo elemento de la lista
     * @return el valor eliminado
     */
    public abstract E remove();

    /**
     * Se encarga de conseguir el tamañoñ de la lista
     * @return el tamaño de la lista
     */
    public int getSize(){
        return count;
    }

}
