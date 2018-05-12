package org.tesji.estoico.operaciones;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*Una calculadora bien pirulas
 * de dos digitos
 * que sume, reste y multiplique 
 */

public class CalculadoraTest {

	@Test
	public void sumarTest() {

		int resultado = Calculadora.sumar(10, 15);

		assertEquals(resultado, 25);

	}
	
	@Test
	public void restarTest() {

		int resultado = Calculadora.restar(20, 15);

		assertEquals(resultado, 5);

	}

}
