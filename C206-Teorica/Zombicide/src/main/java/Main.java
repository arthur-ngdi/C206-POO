public class Main {
    public static void main(String[] args) {
        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();
        z1.vida = 40;
        z2.vida = 40;

        System.out.println("Vida do Z1: " + z1.vida);
        System.out.println("Vida do Z2: " + z2.vida);

        if(z2.tranfereVida(40, z1)){
            System.out.println("Tranferindo vida");
        }else System.out.println("Vida insuficiente para tranferir");

        System.out.println("Vida do Z1: " + z1.vida);
        System.out.println("Vida do Z2: " + z2.vida);

    }
}
