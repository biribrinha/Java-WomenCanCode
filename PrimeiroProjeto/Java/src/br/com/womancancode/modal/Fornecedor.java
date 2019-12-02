package br.com.womancancode.modal;

public class Fornecedor {
	private String nome;
	private String cpf;
	private double salario;
	private int senha;
	
	public Fornecedor(String nome, String cpf, double salario, int senha) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.senha = senha;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	

	
}
