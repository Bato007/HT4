/**
 * @author Orlando Cabrera 19943
 * @author Brandon Hernández 19376
 * @version 23/02/2020
 * @since 23/02/2020
 **/
import java.util.Vector;

public class VectorPila<E> extends AbstractPila<E> implements Pila<E> {

    protected Vector<E> pila = new Vector<E>();
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
	* @post elimina el ultimo elemento de la pila
	* @return el elemento eliminado de la pila
	*/
    public E remove () {
    	return pila.remove(pila.size()-1);
    }
    
    public E peek(){
		return pila.get(pila.size() - 1);
	}

}
