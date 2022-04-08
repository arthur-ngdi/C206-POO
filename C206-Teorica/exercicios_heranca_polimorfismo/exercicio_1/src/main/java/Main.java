public class Main {
    public static void main(String[] args) {
        BrownieNutella bn = new BrownieNutella("juninho", 150.0,"abacate");
        BrownieDoceDeLeite bl = new BrownieDoceDeLeite("robison", 4509.0, "chinelo");
        BrownieCafe bc = new BrownieCafe("paulo", 22000.0, "livro");

        bn.adicionaNutella();
        bn.addCarrinhoDeCompras();
        bn.calculaValorTotal();
        bn.mostraInfo();

        bl.adicionaDoceDeLeite();
        bl.addCarrinhoDeCompras();
        bl.calculaValorTotal();
        bl.mostraInfo();

        bc.adicionaCafe();
        bc.addCarrinhoDeCompras();
        bc.calculaValorTotal();
        bc.mostraInfo();


    }
}
