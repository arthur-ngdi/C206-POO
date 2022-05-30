public class Main {
    public static void main(String[] args) {

        Conta c1 = new Conta();
        c1.saldo = 50;
        Conta c2 = new Conta();
        c2.saldo = 100;

        System.out.println("Saldo c1: " + c1.saldo);
        System.out.println("Saldo c2: " + c2.saldo);

        c2.transferir(20, c1);
        System.out.println("Saldo c1: " + c1.saldo);
        System.out.println("Saldo c2: " + c2.saldo);
    }

}
