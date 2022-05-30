public class BrownieCafe extends Brownie {

    public BrownieCafe(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionaCafe(){

    }

    @Override
    public void addCarrinhoDeCompras() {
        System.out.println("Brownie de Café adicionado ao carrinho de compra");
    }
}
