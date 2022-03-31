public class Produto {

    private String nome;
    private double preco;

    public String etiquetaPreco(){
        System.out.println("Etiqueta de preço:");
        return this.nome + "\r\n" + this.preco;
    }

}
