package testeMaven;

import org.junit.Assert;
import org.junit.Test;


public class CalculadoraTestSubtracao {
	
	public void deveImprimirOResultadoDaSubtracaoDeQuatroMenosDois() {

		Calculadora calculadora = new Calculadora(4, 2);
		
		int valorEsperado = 2;
		int resultado = calculadora.subtracao();
		
		Assert.assertEquals(valorEsperado, resultado);
		System.out.println(valorEsperado);
		System.out.println(resultado);
		
	}

}
