public class BrownieDoceDeLeite extends Brownie{

    public BrownieDoceDeLeite(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionaDoceDeLeite(){

    }

    @Override
    public void addCarrinhoDeCompras() {
        System.out.println("Brownie de doce de leite adicionado ao carrinho de compra");
    }
}
