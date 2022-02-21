public class Conta {

    public double saldo, limite;

    public void sacar(double valor){
        this.saldo += valor;
    }

    public void depositar (double valor){
        this.saldo -= valor;
    }

    public void transferencia(double valor, Conta destino){
        System.out.println("Fazendo a Transferência...");
        this.saldo -= valor;
        destino.saldo += valor;
    }



}
