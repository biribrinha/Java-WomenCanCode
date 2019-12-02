package br.com.womancancode.modal;

import br.com.womancancode.modal.Funcionario;

public class Superintendente extends Funcionario implements InterfaceAutenticavel {

	private int senha;

	public Superintendente(String nome, String cpf, double salario, int senha, int numeroDefuncionarioGerenciados) {
		super(nome, cpf, salario, senha);
		this.senha = senha;
		// TODO Auto-generated constructor stub

	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public boolean autentica(int senha) {
		return false;
	}

}
