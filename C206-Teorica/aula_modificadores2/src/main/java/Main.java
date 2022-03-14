public class Main {

    public static void main(String[] args) {
        Conta conta1 = new Conta();

        conta1.deposita(300);
        System.out.println(conta1.getSaldo());

        conta1.saca(120);
        System.out.println(conta1.getSaldo());
    }


}
