public class Conta {

    double saldo, limite;

    public void sacar(double valor){
        saldo += valor;
    }

    public void depositar (double valor){
        saldo -= valor;
    }

    public void transferencia(double valor, Conta destino){
        this.saldo -= valor;
        destino.saldo += valor;
    }



}
