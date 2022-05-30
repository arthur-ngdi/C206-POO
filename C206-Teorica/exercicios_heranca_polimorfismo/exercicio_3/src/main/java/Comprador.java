public class Comprador {

    private String nome;
    private double saldo;

    public Comprador(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void efetuarCompra(Brownie brownie){
        if(this.saldo < brownie.preco) System.out.println("Saldo insuficiente");
        else{
            brownie.addCarrinhoDeCompras();
            brownie.calculaValorTotal();
        }


    }
}
