/**
 * @author Orlando Cabrera 19943
 * @author Brandon Hernández 19376
 * @version 23/02/2020
 * @since 23/02/2020
 **/
public class Factory {


    public Pila<Integer> getFactory(String instance){
        switch (instance){
            case "2":
                return new VectorPila<Integer>();

            //case "31":
              //  break;

            //case "32":
              //  break;

            //case "33":
              //  break;

            default:
                return new ArrayListPila<Integer>();
        }
    }

}
