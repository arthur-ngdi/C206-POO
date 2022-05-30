public class Ashen {
    String nome;
    int vida;
    Arma arma;

    public Ashen(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;

    }

    void usarArma(){
        arma.resistencia -= 2;
        System.out.println("Resistência da arma: " + arma.resistencia);
    }

    void tomarDano(){
        this.vida -= 5;
        System.out.println("VIda: " + this.vida);
    }

}
