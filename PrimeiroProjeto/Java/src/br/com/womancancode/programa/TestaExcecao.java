package br.com.womancancode.programa;

public class TestaExcecao {
	public static void main(String args[]) {
		System.out.println("inicio do main");
		metodo1();
		System.out.println("fim do main ");

	}

	static void metodo1() {
		System.out.println("inicio do metodo1");
		metodo2();
		System.out.println("fim do metodo1");
	}

	static void metodo2() {
		System.out.println("inicio do metodo2");
		ContaCorrente cc = new ContaCorrente();
		for (int i = 0; i <= 15; i++) {
			cc.Deposita(i + 1000);
			System.out.println(cc.getContaCorrente());
			if (i == 5) {
				cc = null;
			}
		}
		System.out.println("fim do metod2");
	}

}
