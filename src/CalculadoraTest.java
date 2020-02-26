import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class CalculadoraTest {

	Calculadora cal = Singleton.getSingle();

	@Test
	public void testSuma(){
		int resultado = cal.sumar(2,3);
		int esperado = 5; // 2 + 3 = 5
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testResta(){
		int resultado = cal.restar(5,1);
		int esperado = 4; // 5 - 1 = 4
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testMultiplicacion(){
		int resultado = cal.multiplicar(2,4);
		int esperado = 8; // 2 * 4 = 8
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testDivision(){
		int resultado = cal.dividir(9,3);
		int esperado = 3; // 9 / 3 = 3
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testSuma2(){
		int resultado = cal.sumar(5,5);
		int esperado = 10; // 5 + 5 = 10
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testResta2(){
		int resultado = cal.restar(1,5);
		int esperado = -4; // 1 - 5 = -4
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testMultiplicacio2n(){
		int resultado = cal.multiplicar(3,3);
		int esperado = 9; // 3 * 3 = 9
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testDivision2(){
		int resultado = cal.dividir(9,0);
		int esperado = 0; // 9 / 0 = error, 0
		assertEquals(esperado, resultado);
	}

}
