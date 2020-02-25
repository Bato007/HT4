/**
 * @author Orlando Cabrera 19943
 * @author Brandon Hernández 19376
 * @version 25/02/2020
 * @since 2502/2020
 *
 * Encargado de devolver una instancia dependiendo de una lista
 **/
public class ListFactory<E> {

    /**
     * Se encarga de mandar una instancia de una lista que a su vez es pila
     * @param instance es la instancia que desea el usuario
     * @return la instancia de una pila
     */
    public Pila<E> getFactory(String instance){
        switch (instance){
            case "11":
                return new ListaSimple<E>();
            case "12":
                return new ListaDoble<E>();
            default:
                return new ListaCircular<E>();
        }
    }

}
