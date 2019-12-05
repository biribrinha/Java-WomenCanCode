package testeMaven;

import org.junit.Assert;
import org.junit.Test;


public class CalculadoraTestMultiplicacao {
	@Test
	public void deveImprimirOResultadoDaMultiplicacaoDeQuatroVezesDois() {

		Calculadora calculadora = new Calculadora(4, 2);
		
		int valorEsperado = 8;
		int resultado = calculadora.multiplicacao();
		
		Assert.assertEquals(valorEsperado, resultado);
		System.out.println(valorEsperado);
		System.out.println(resultado);
		
	}

}
