/**
 * @author Orlando
 * @author Brandon Hernández 19376
 * @version 23/02/2020
 * @since 23/02/2020
 *
 * Encargado de devolver una instancia de la calculadora
 */
public class Singleton {

    // Instancia de la calculadora
    private static Calculadora uniqueInstance;

    /**
     * Se encarga de instanciar solamente una instancia
     * @pos si no esta instanciada instancia una calculadora
     * @return el valor que tiene uniqueInstance
    */
    public static Calculadora getSingle(){
        if(uniqueInstance == null){
            uniqueInstance = new CalculadoraPostFix();
        }
        return uniqueInstance;
    }

}
