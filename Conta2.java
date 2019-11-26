class Conta2{
    private static int TotalDeContas;

    Conta2(){
        Conta2.TotalDeContas=Conta2.TotalDeContas+1;
    }
    public static int getTotalDeContas(){
        return Conta2.TotalDeContas;
    }
}

  