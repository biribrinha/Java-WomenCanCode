package br.com.womancancode.programa;
import br.com.womancancode.modal.Gerente;

public class TestaGerente {

	
	public static void main(String[] args) {
		
		
		// isso aqui ó: ele ta reservando na memória 
		//ele tem um endereço
		//o g vai receber o endereço
		// quando eu chamar o g, ele vai ("g.getNome")
		//ele vai verificar onde tá o endereço e vai usar o nome
		
		Gerente g1 = new Gerente("Joana", "12345",1000,123,5);
		g1.autentica(123);
		
		
		
	}
	
	
}
