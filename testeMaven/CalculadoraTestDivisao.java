package testeMaven;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTestDivisao {
	
	@Test
	public void deveImprimirOResultadoDaDivisaoDeZeroDivididoPorDois() {

		Calculadora calculadora = new Calculadora(0, 2);
		
		double valorEsperado = 0;
		double resultado = calculadora.divisao();		
		Assert.assertEquals(valorEsperado, resultado, 0);		
		System.out.println(valorEsperado);
		System.out.println(resultado);
	}

}
