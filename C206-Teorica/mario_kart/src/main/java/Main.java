public class Main {
    public static void main(String[] args) {
        Kart k1 = new Kart("Herbie", "150", 150);
        Piloto p1 = new Piloto("rubinho", true);

        k1.piloto = p1;
        System.out.println(k1.motor.getCilindradas());
        System.out.println(k1.motor.getVelocidadeMaxima());
        k1.motor.setVelocidadeMaxima(50);
        System.out.println(k1.motor.getVelocidadeMaxima());

    }


}
