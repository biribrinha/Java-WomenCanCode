package br.com.womancancode.modal;

public class Gerente extends Funcionario implements InterfaceAutenticavel {

	public Gerente(String nome, String cpf, double salario, int senha, int numeroDeFuncionariosGerenciados) {
		super(nome, cpf, salario, senha);
	}

	@Override
	public int getNumeroDeFuncionariosGerenciados() {
		return super.getNumeroDeFuncionariosGerenciados();
	}

	@Override
	public boolean autentica(int senha) {

		if (this.senha == senha) {
			System.out.println("acesso Negado!");
			return false;
		} else {
			System.out.println("Autorizadoo! :)");
			return true;
		}

	}

}
