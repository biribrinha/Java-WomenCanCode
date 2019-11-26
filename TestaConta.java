// public class TestaConta{
// public static void main(String args[]){
// Conta c1=new Conta();
// Conta c2=new Conta();
// c1.saldo=70;
// c2.saldo=2;

// System.out.println("C1 antes da transfer�ncia "+ c1.saldo);
// c2.transfere(c1,2);
// System.out.println("C1 antes da transfer�ncia "+ c1.saldo);


// }


// }

class TestaConta{
	public static void main (String args[]){

		Conta c1= new Conta();
		c1.setTitular("joana");
		c1.setSaldo(1000);
		System.out.println("saldo: "+ c1.getSaldo()+c1.getTitular()); // o sinal de + ele serve imprimir mais de uma informação
 
	}
}
