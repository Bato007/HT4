/**
 * @author Orlando Cabrera 19943
 * @author Brandon Hernández 19376
 * @version 25/02/2020
 * @since 23/02/2020
 *
 * Contrato para una list
 **/
public interface Lista<E> {

    /**
     * Se encarga de agregar un dato al final de la lista
     * @pos se agrega un nuevo elemento a la listsa
     * @param value dato que se agregara a la lista
     */
    public void add(E value);

    /**
     * Se encarga de eliminar y retornar el ultimo valor
     * @pre la lista no debe de estar vacia
     * @pos se elimina el ultimo elemento de la lista
     * @return el valor eliminado
     */
    public E remove();

    /**
     * Se encarga de conseguir el tamañoñ de la lista
     * @return el tamaño de la lista
     */
    public int getSize();

}
