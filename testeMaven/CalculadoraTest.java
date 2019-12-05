package testeMaven;

import org.junit.Assert;
import org.junit.Test;



public class CalculadoraTest {
	
	@Test
	public void deveImprimirOResultadoDaSomaDeDoisMaisQuatro() {

		Calculadora calculadora = new Calculadora(2, 4);
		
		int valorEsperado = 6;
		int resultado = calculadora.soma();
		
		
		Assert.assertEquals(valorEsperado, resultado);
		System.out.println(valorEsperado);
		System.out.println(resultado);
		
	}
	@Test
	public void deveImprimirOResultadoDaDivisaoDeZeroDivididoPorDois() {

		Calculadora calculadora = new Calculadora(0, 2);
		
		double valorEsperado = 0;
		double resultado = calculadora.divisao();		
		Assert.assertEquals(valorEsperado, resultado, 0);		
		System.out.println(valorEsperado);
		System.out.println(resultado);
	}
	@Test
	public void deveImprimirOResultadoDaMultiplicacaoDeQuatroVezesDois() {

		Calculadora calculadora = new Calculadora(4, 2);
		
		int valorEsperado = 8;
		int resultado = calculadora.multiplicacao();
		
		Assert.assertEquals(valorEsperado, resultado);
		System.out.println(valorEsperado);
		System.out.println(resultado);
		
	}
	
	@Test
	public void deveImprimirOResultadoDaSubtracaoDeQuatroMenosDois() {

		Calculadora calculadora = new Calculadora(4, 2);
		
		int valorEsperado = 2;
		int resultado = calculadora.subtracao();
		
		Assert.assertEquals(valorEsperado, resultado);
		System.out.println(valorEsperado);
		System.out.println(resultado);
		
	}

	
	
		
}
