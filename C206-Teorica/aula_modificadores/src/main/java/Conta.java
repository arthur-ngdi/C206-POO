public class Conta {

    Cliente cliente;
    private double saldo, limite;

    public Conta(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    public Conta(){

    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    void sacar(double valor){
        saldo -= valor;
    }

    void depositar(double valor){
        saldo += valor;
    }

}
