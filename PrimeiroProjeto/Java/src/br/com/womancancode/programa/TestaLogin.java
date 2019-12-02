package br.com.womancancode.programa;

import br.com.womancancode.modal.Gerente;
import br.com.womancancode.modal.InterfaceAutenticavel;
import br.com.womancancode.modal.SistemaInterno;



public class TestaLogin {
	
	public static void main (String args[]) {
		InterfaceAutenticavel gerente = new Gerente("Manoel", "12.123.456-85", 1000, 123, 5);
		SistemaInterno sistema = new SistemaInterno();
		sistema.login(gerente);
	}

}
