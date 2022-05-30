public class Carta {

    String nome;
    String tipo;
    double poder;
    Arma arma;

    public Carta(String nome, String tipo, double poder, String tipoArma){
        this.nome = nome;
        this.tipo = tipo;
        this.poder = poder;
        arma = new Arma(tipoArma);
    }

    void mostraInfo(){
        System.out.println("Nome:" + nome);
        System.out.println("Tipo da carta: " + tipo);
        System.out.println("Poder: " + poder);
        System.out.println("Arma: " + arma);
    }
}
