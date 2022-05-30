public class Main {
    public static void main(String[] args) {
        Comprador c1 = new Comprador("Evaristo", 1000);
        Brownie bn = new BrownieNutella("juninho", 150.0,"abacate");
        Brownie bl = new BrownieDoceDeLeite("robison", 4509.0, "chinelo");
        Brownie bc = new BrownieCafe("paulo", 22000.0, "livro");

        c1.efetuarCompra(bn);

    }
}
