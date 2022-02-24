public class Nave {
    String nome;
    int velocidade;
    boolean velocidadeDaLuz;
    Arma arma;

    public Nave(String nome, int velocidade, boolean velocidadeDaLuz) {
        Arma arma = new Arma();
        this.nome = nome;
        this.velocidade = velocidade;
        this.velocidadeDaLuz = velocidadeDaLuz;
    }

    void mostraInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade: " + this.velocidade);
        System.out.println(this.velocidadeDaLuz?"Viaja na velocidade da luz":"não vija na velocidade da luz");
        if(this.arma != null){
            System.out.println("Tipo da arma: " + this.arma.tipo);
            System.out.println("Poder da arma: " + this.arma.poder);
        }else{
            System.out.println("A nave não possui arma");
        }
    }

}
