package br.com.womancancode.modal;

public class Diretor extends Funcionario implements InterfaceAutenticavel {

	public Diretor(String nome, String cpf, double salario, int senha, int numeroDefuncionarioGerenciados) {
		super(cpf, cpf, salario, numeroDefuncionarioGerenciados);
	}

	public double getBonificacao() {
		return getSalario() * 1.3 + 1000;
	}

	public boolean autentica(int senha) {
		if (getSenha() == senha) {
			System.out.println("Acesso Permitido");
			return true;
		} else {
			System.out.println("Acesso Negado");
			return false;
		}
	}

}
