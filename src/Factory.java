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
