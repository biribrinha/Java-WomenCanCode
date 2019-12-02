
public class LimiteCliente {
	private double limite;
	private double saldo;
	
	public double getLimite() {
		return limite;
	}
	
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public LimiteCliente(double limite, double saldo) {
		super();
		this.limite = limite;
		this.saldo = saldo;
	}
	
}
