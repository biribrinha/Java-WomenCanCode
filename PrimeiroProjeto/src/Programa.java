
public class Programa {

	public static void main(String[] args) {
		
		/*Cliente c1 = new Cliente("Neuza", "12345678-90");
		Conta minhaConta = new Conta(125, c1, 10000, 1000);*/

		Conta c1 = new Conta(123, new Cliente("Pamela", "123.456.789-00"), 1000, 1000);
		
		System.out.println(c1.getTitular().getNome());
		System.out.println(c1.getTitular().getCpf());
		System.out.println(c1.getSaldo());


		Cliente c2 = new Cliente("Neymar", "99999999-90");
		Conta contaNey = new Conta(123, c2, 1000000, 100000);

		System.out.println(contaNey.getSaldo());

		boolean sacou = c1.saca(300.00);
		if (sacou) {
			System.out.println("Saque realizado!!");
		} else {
			System.out.println("Saldo insuficiente.");
		}
		System.out.println("Saldo atual da Amanda:" + c1.getSaldo());

		boolean sacou2 = contaNey.saca(100.00);
		if (sacou) {
			System.out.println("Saque realizado!(Neymar)");
		} else {
			System.out.println("Saldo insuficiente(Neymar)");
		}
		
	}

	
	
}
