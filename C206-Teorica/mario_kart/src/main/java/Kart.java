public class Kart {
     private String nome;
     Piloto piloto;
     Motor motor;


    public Kart(String nome, String cilindradas, double velocidadeMaxima) {
        this.nome = nome;
        this.motor = new Motor(cilindradas, velocidadeMaxima);
    }



    public void pular(){
        System.out.println("pulo!");
    }

    public void soltarDrift(){
        System.out.println("DRIFT!!!");
    }

    public void soltarTurbo(){
        System.out.println("ZUUUUUUUUUMMMMMM!");
    }
}
