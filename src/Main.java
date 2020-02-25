import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

/**
 * @author Orlando Cabrera 19943
 * @author Brandon Hern√°ndez 19376
 * @version 23/02/2020
 * @since 23/02/2020
 **/
public class Main {
    public static void main(String[] args){
    	Factory factory = new Factory();
    	String tipoL;
    	@SuppressWarnings("resource")
		Scanner teclado = new Scanner (System.in);
    	System.out.println("Introduzca que tipo de pila desea usar (1. ArrayList, 2. Vector, 3. Lista)");
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
    	Pila<Integer> pila = factory.getFactory(tipo);
    	CalculadoraPostFix cal = new CalculadoraPostFix();
    	//Solo para verificar que si se cree correctamente el tipo de pila
    	if(pila instanceof ArrayListPila){
			System.out.println("Si funciona");
		}
    	 /* File archivo = null;
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
	         archivo = new File ("datos.txt"); //Hay que crear el archivo para que sirva
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
	    	  System.out.println ("El documento posee una operaciÛn incorrecta");
	      }*/











        
    }



}
