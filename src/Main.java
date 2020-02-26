import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

/**
 * @author Orlando Cabrera 19943
 * @author Brandon Hernández 19376
 * @version 23/02/2020
 * @since 23/02/2020
 *
 * Se encarga de correr el programa
 * Link GitHub: https://github.com/Bato007/HT4
 **/
public class Main {
    public static void main(String[] args){
    	PilaFactory<Integer> pilaFactory = new PilaFactory<Integer>();
    	@SuppressWarnings("resource")
    	String tipoL;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca el nombre del documento (datos.txt)");
		String documento = teclado.nextLine();
    	System.out.println("Introduzca que tipo de lista desea usar (1. Vector, 2. ArrayList, 3.Lista)");
    	String tipo = teclado.nextLine();
    	if (tipo.contentEquals("3")) {
    		System.out.println("Introduzca que tipo de lista desea utilizar: ");
    		System.out.println("1.Lista Circular, 2.Lista Doble, 3.Lista Simple");
    		tipoL = teclado.nextLine();
    		if (tipoL.contentEquals("1")) {
    			tipo = "4";
    		}
    		if (tipoL.contentEquals("2")) {
    			tipo = "5";
    		}
    		if (tipoL.contentEquals("3")) {
    			tipo = "6";
    		}
    	}
    	Pila<Integer> pila = pilaFactory.getFactory(tipo);
    	Calculadora cal = Singleton.getSingle();
    	//Solo para verificar que si se cree correctamente el tipo de pila
    	if(pila instanceof ArrayListPila){
			System.out.println("Tipo de lista utilizada: Arraylist");
		} 
    	if(pila instanceof VectorPila){
			System.out.println("Tipo de lista utilizada: Vector");
		} 
    	if(pila instanceof ListaSimple){
			System.out.println("Tipo de lista utilizada: ListaSimple");
		} 
    	if(pila instanceof ListaDoble){
			System.out.println("Tipo de lista utilizada: ListaDoble");
		} 
    	if(pila instanceof ListaCircular){
			System.out.println("Tipo de lista utilizada: ListaCircular");
		} 
    	 
    	  
    	  File archivo = null;
	      FileReader fr = null;
	      BufferedReader br = null;
	      String linea = null;
	      String contenido = null;
	      String suma = "+";
	      String resta = "-";
	      String mul = "*";
	      String div = "/";
	      int n = 1;
	      Integer num1 = 0;
	      Integer num2 = 0;
	      
  	  //Codigo para leer archivos de texto sacado de: http://chuwiki.chuidiang.org/index.php?title=Lectura_y_Escritura_de_Ficheros_en_Java
	      try {
	         // Apertura del fichero y creacion de BufferedReader para poder
	         // hacer una lectura comoda (disponer del metodo readLine()).
	         archivo = new File (documento); //Hay que crear el archivo para que sirva
	         fr = new FileReader (archivo);
	         br = new BufferedReader(fr);

	         // Lectura del fichero
	         while((linea=br.readLine())!=null)
	        	contenido = linea.replace(" ", "");

	      }
	      catch(Exception e){
	         e.printStackTrace();
	      }finally{
	         // En el finally cerramos el fichero, para asegurarnos
	         // que se cierra tanto si todo va bien como si salta 
	         // una excepcion.
	         try{                    
	            if( null != fr ){   
	               fr.close();     
	            }                  
	         }catch (Exception e2){ 
	            e2.printStackTrace();
	         }
	      }
	      System.out.println("Datos que contiene el documento: "+contenido);
	      
	      //Ciclo para llenar el stack con los datos del documento y operar
	      try {
	    	  for (int i=0;i<contenido.length();i++) {
		    	  
		    	  if (contenido.substring(i, i+1).equals(suma)||contenido.substring(i, i+1).equals(resta)||contenido.substring(i, i+1).equals(mul)||contenido.substring(i, i+1).equals(div)) {
		    		  if (contenido.substring(i, i+1).equals(suma)) {
			    		  num2= pila.remove();
			    		  num1= pila.remove();
			    		  pila.add(cal.sumar(num1, num2));
			    		  System.out.println("Resultado de la "+ n + " operacion= "+pila.peek());
			    		  n++;
			    	  }
			    	  if (contenido.substring(i, i+1).equals(resta)){
			    		  num2= pila.remove();
			    		  num1= pila.remove();
			    		  pila.add(cal.restar(num1, num2));
			    		  System.out.println("Resultado de la "+ n + " operacion= "+pila.peek());
			    		  n++;
			    	  }
			    	  if (contenido.substring(i, i+1).equals(mul)){
			    		  num2= pila.remove();
			    		  num1= pila.remove();
			    		  pila.add(cal.multiplicar(num1, num2));
			    		  System.out.println("Resultado de la "+ n + " operacion= "+pila.peek());
			    		  n++;
			    	  }
			    	  if (contenido.substring(i, i+1).equals(div)){		    		  
			    		  num2= pila.remove();
			    		  num1= pila.remove();
			    		  pila.add(cal.dividir(num1, num2));
			    		  System.out.println("Resultado de la "+ n + " operacion= "+pila.peek());
			    		  n++;
			    	  }  
		    	  }
		    	  else {
		    		  pila.add(Integer.parseInt(contenido.substring(i, i+1)));
		    	      
		    	  }
		    	  
		    }
	    	  
	      }catch (Exception e) {
	    	  System.out.println ("El documento posee una operacion incorrecta");
	      }











        
    }



}
