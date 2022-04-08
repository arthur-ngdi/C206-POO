public class Brownie {

    protected String nome;
    protected double preco;
    protected String sabor;

    public Brownie(String nome, double preco, String sabor) {
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    public void addCarrinhoDeCompras(){
        System.out.println("Adicionado ao carrinho de compra");
    }

    public void calculaValorTotal(){
        System.out.println("O nome do Brownie é: " + this.nome);
        System.out.println("O preço do Brownie é: " + this.preco);

    }

    public void mostraInfo(){

        System.out.println("O nome do Brownie é: " + this.nome);
        System.out.println("O preço do Brownie é: " + this.preco);
        System.out.println("O sabor do Brownie é: " + this.sabor);
    }
}
