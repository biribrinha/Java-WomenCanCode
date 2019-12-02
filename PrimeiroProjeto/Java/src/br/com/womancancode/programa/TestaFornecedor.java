package br.com.womancancode.programa;

import br.com.womancancode.modal.Fornecedor;

public class TestaFornecedor {
	public static void main(String[] args) {
		Fornecedor h2 = new Fornecedor("adelaide", "123456", 1234, 222);
		System.out.println(h2.getNome());

	}
}
