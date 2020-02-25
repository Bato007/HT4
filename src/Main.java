import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Orlando Cabrera 19943
 * @author Brandon Hernández 19376
 * @version 23/02/2020
 * @since 23/02/2020
 **/
public class Main {
    public static void main(String[] args){
    	Factory factory = new Factory();
    	Scanner teclado = new Scanner (System.in);
    	System.out.println("Introduzca que tipo de lista desea usar (1. ArrayLisy, 2. Vector)");
    	String tipo = teclado.nextLine();
    	Pila pila = factory.getFactory(tipo);
    	//Solo para verificar que si se cree correctamente el tipo de pila
    	if(pila instanceof ArrayListPila){
			System.out.println("Si es un arraylist");
		}











        
    }



}
