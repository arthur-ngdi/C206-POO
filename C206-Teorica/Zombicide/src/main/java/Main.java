public class Main {
    public static void main(String[] args) {
        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();
        z1.vida = 40;
        z2.vida = 40;

        System.out.println("Vida do Z1: " + z1.vida);
        System.out.println("Vida do Z2: " + z2.vida);

        z2.tranfereVida(20,z1);

        System.out.println("Vida do Z1: " + z1.vida);
        System.out.println("Vida do Z2: " + z2.vida);

    }
}
