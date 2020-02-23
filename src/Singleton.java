/**
 * @author Orlando
 * @author Brandon Hernández 19376
 * @version 23/02/2020
 * @since 23/02/2020
 *
 * Encargado de devolver 
 */
public class Singleton {

    private static Calculadora uniqueInstance;

    public Calculadora getSingle(){
        if(uniqueInstance == null){
            uniqueInstance = new CalculadoraPostFix();
        }
        return uniqueInstance;
    }

}
