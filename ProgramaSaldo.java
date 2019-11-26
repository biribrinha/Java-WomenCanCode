class ProgramaSaldo{
public static void main(String[]args){
Conta minhaConta;
minhaConta=new Conta();

minhaConta.titular="Clodomiro";
minhaConta.saldo=1000.0;

System.out.println("saldo atual:"+minhaConta.saldo);
}
}