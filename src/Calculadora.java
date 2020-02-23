/**
 * @author Orlando
 * @author Brandon Hernández 19376
 * @version 23/02/2020
 * @since 23/02/2020
 *
 * Contrato de una calculadora que realiza operaciones
 * aritméticas básicas
 */
public interface Calculadora {
    /**
     * Suma dos números
     * @post crea un número resultante de la suma de los dos enviados
     * @param numero1 es el primer número que se sumara con el segundo
     * @param numero2 es el segundo número que se sumara con el primero
     * @return devuelve la suma de los dos números
     */
    public int sumar(int numero1, int numero2);

    /**
     * Resta dos números
     * @post crea un número resultante de la resta de los dos enviados
     * @param numero1 es el primer número que sera restado con el segundo
     * @param numero2 es el segundo número que se restara del primero
     * @return devuelve la resta de los dos números
     */
    public int restar(int numero1, int numero2);

    /**
     * Multiplicacion dos números
     * @post crea un número resultante de la multiplicacion de los dos enviados
     * @param numero1 es el primer número que se multliplicara con el segundo
     * @param numero2 es el segundo número que se multiplicara con el primero
     * @return devuelve la multilplicacion de los dos números
     */
    public int multiplicar(int numero1, int numero2);

    /**
     * Division dos números (verifica que el dividendo no sea 0)
     * @post crea un número resultante de la division de los dos enviados
     * @param numero1 es el primer número es el divisor
     * @param numero2 es el segundo número es el dividendo
     * @return devuelve la division de los dos números
     */
    public int divir(int numero1, int numero2);

}
