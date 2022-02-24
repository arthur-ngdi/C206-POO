public class Main {
    public static void main(String[] args) {

        Nave n1 = new Nave("Mantis", 200, true);
        n1.arma.tipo = "Canhão";
        n1.arma.poder = 2000;

        n1.mostraInfo();

    }
}
