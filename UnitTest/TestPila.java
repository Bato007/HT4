import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author Orlando
 * @author Brandon Hernández 19376
 * @version 25/02/2020
 * @since 25/02/2020
 *
 */
class TestPila {
	PilaFactory<Integer> pilaFactory = new PilaFactory<Integer>();
	/**
	 * Probar si se crea correctamente el tipo de pila del Factory
	 */
	@Test
	public void testVectorPila(){
		Pila<Integer> pila = pilaFactory.getFactory("1");
		if(pila instanceof VectorPila){
			assertEquals (1, 1);
		}else {
			assertEquals (1, 2);
		}
		
	}
	/**
	 * Probar si se crea correctamente el tipo de pila del Factory
	 */
	@Test
	public void testArrayListPila(){
		Pila<Integer> pila = pilaFactory.getFactory("2");
		if(pila instanceof ArrayListPila){
			assertEquals (1, 1);
		}else {
			assertEquals (1, 2);
		}
		
	}
	/**
	 * Probar si se crea correctamente el tipo de lista del Factory
	 */
	@Test
	public void testLista(){
		Pila<Integer> pila = pilaFactory.getFactory("4");
		Pila<Integer> pila2 = pilaFactory.getFactory("5");
		Pila<Integer> pila3 = pilaFactory.getFactory("6");
		if(pila instanceof ListaCircular && pila2 instanceof ListaDoble && pila3 instanceof ListaSimple){
			assertEquals (1, 1);
		}else {
			assertEquals (1, 2);
		}
		
	}
	/**
	 * Comprobando que el add agregue en la ultima posicion y que el remove saque el de la primera posicion (Primero en entrar, ultimo en salir)
	 */
	@Test
	public void testAdd(){
		Pila<Integer> pila = pilaFactory.getFactory("1");
		Pila<Integer> pila2 = pilaFactory.getFactory("2");
		pila.add(5);
		pila2.add(2);
		pila2.add(8);
		pila.add(8);
		assertEquals(pila.remove(),pila2.remove());
		
	}
	/**
	 * Comprobando que el add agregue en la ultima posicion y que el remove saque el de la primera posicion (Primero en entrar, ultimo en salir)
	 */
	@Test
	public void testAdd2(){
		Pila<Integer> pila = pilaFactory.getFactory("4");
		Pila<Integer> pila2 = pilaFactory.getFactory("6");
		pila.add(5);
		pila2.add(2);
		pila2.add(8);
		pila.add(8);
		//System.out.println(pila2.remove());
		//System.out.println(pila.peek());
		assertEquals(pila.remove(),pila2.remove());
		
	}
	

}
