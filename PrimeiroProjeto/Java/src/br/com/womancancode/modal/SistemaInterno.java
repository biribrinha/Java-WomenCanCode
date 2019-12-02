package br.com.womancancode.modal;

public class SistemaInterno {
	public void login(InterfaceAutenticavel a) {
		int senha = 123; // obtem a senha de algum lugar...
		boolean autenticou = a.autentica(senha);
		System.out.println("Usuario esta logado: " + autenticou);
	}

}
