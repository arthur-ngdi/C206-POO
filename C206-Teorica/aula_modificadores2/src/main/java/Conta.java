public class Conta {
    private int numero;
    private double saldo;
    private double limite = 100;
    private Cliente titular;

    public double getSaldo() {
        return saldo;
    }

    private boolean verificaSerasa(double valor){
        if(limite > valor) return true;
            else return false;
    }

    void deposita(double valor){
        if(valor > 0){
            this.saldo += valor;
            System.out.println("Depósito Realizado");
        }else System.out.println("Valor inválido");
    }

    void saca(double valor){
        if(verificaSerasa(valor)){
            if(this.saldo > valor) {
                this.saldo -= valor;
                System.out.println("Saque Realizado");
            } else System.out.println("Não é possível realizar a operação");
        }else System.out.println("limite insuficiente");
    }

}
