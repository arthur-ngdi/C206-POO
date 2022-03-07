public class Motor {

    private String cilindradas;
    public double velocidadeMaxima;

    public Motor(String cilindradas, double velocidadeMaxima) {
        this.cilindradas = cilindradas;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public String getCilindradas() {
        return cilindradas;
    }

    public void mostraInfo(){
        System.out.println(cilindradas);
        System.out.println(velocidadeMaxima);
    }
}
