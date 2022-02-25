public class Arma {

    String nome;
    int poder;
    int resistencia;
    String descricao;

    public Arma(String nome, int poder, int resistencia, String descricao) {
        this.nome = nome;
        this.poder = poder;
        this.resistencia = resistencia;
        this.descricao = descricao;
    }

    void mostraInfoArma(){
        System.out.println("Poder: " + this.poder);
        System.out.println("Resistência: " + this.resistencia);
        System.out.println("Descrição: " + this.descricao);
    }
}
