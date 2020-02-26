import java.util.ArrayList;

/**
 * @author Orlando
 * @author Brandon Hernández 19376
 * @version 23/02/2020
 * @since 23/02/2020
 *
 *
 */
public class ArrayListPila<E> extends AbstractPila<E> implements Pila<E> {

    protected ArrayList<E> pila = new ArrayList<E>();
    /**
	* Agrega un dato a la pila sin importar cuantos datos hay
	* @post se le agrega un elemento a la pila
	*/
    public void add (E value) {
    	pila.add(value);
    }
    /**
	* Elimina un elemento de la pila
	* @pre hay por lo menos un elemento en la pila
	* @post elimina el prime elemento de la pila
	* @return el elemento eliminado de la pila
	*/
    public E remove () {
    	return pila.remove(pila.size()-1);
    }
    
    /** Se encarga de mostrar el ultimo valor ingresado
     * @pre la pila debe de tener al menos un valor
     * @pos muestra el ultimo valor
     * @return el ultimo valor de la pila
     **/
    public E peek(){
		return pila.get(pila.size() - 1);
	}

}
