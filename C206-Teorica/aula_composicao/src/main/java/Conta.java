public class Conta {

    double saldo, limite;
    Cliente cliente;



    void sacar(double valor){
        this.saldo -= valor;
    }

    void depositar (double valor){
        this.saldo += valor;
    }

}
