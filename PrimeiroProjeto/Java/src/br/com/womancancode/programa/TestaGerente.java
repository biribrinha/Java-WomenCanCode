package br.com.womancancode.programa;
import br.com.womancancode.modal.Gerente;

public class TestaGerente {

	
	public static void main(String[] args) {
		
		
		// isso aqui �: ele ta reservando na mem�ria 
		//ele tem um endere�o
		//o g vai receber o endere�o
		// quando eu chamar o g, ele vai ("g.getNome")
		//ele vai verificar onde t� o endere�o e vai usar o nome
		
		Gerente g1 = new Gerente("Joana", "12345",1000,123,5);
		g1.autentica(123);
		
		
		
	}
	
	
}
