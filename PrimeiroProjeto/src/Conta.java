
public class Conta {
	//private String titular;
	private int numero;
	private Cliente titular;
	private LimiteCliente saldo;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
		
	public LimiteCliente getSaldo() {
		return saldo;
	}
	
	public void setSaldo(LimiteCliente saldo) {
		this.saldo = saldo;
	}
	
	public Conta(int numero, Cliente titular, LimiteCliente saldo) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	boolean saca(double valor) {
		if (this.saldo < valor) {
			return false;
		} else {
			this.saldo = this.saldo - valor;
			return true;
		}
	}

	void deposita(double quantidade) {
		this.saldo += quantidade;
	}

	boolean transfere(Conta destino, double valor) {
		boolean retirou = this.saca(valor);
		if (retirou == false) {
			return false;
		} else {
			destino.deposita(valor);
			return true;
		}
	}
	
	
}
