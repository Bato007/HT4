/**
 * @author Orlando Cabrera 19943
 * @author Brandon Hernández 19376
 * @version 23/02/2020
 * @since 23/02/2020
 *
 * Encargado de devolver una instancia dependiendo de una pila
 **/
public class PilaFactory<E> {

    /**
     * Se encarga de obtener la instancia
     * @param instance es la opcion que eligio el usuario
     * @return la instancia de una pila
     */
    public Pila<E> getFactory(String instance){

        ListFactory<E> listFactory = new ListFactory<E>();

        switch (instance){
            case "1":
                return new VectorPila<E>();
            case "2":
                return new ArrayListPila<E>();
            case "4":
            	return new ListaCircular <E>();
            case "5":
            	return new ListaDoble <E>();
            case "6":
            	return new ListaSimple <E>();
            	
            default:
                return listFactory.getFactory(instance);
        }
    }

}
