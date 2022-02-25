public class Main {
    public static void main(String[] args) {

        Conta c1 = new Conta();
        c1.saldo = 1000;
        c1.limite = 10;

        Cliente cliente = new Cliente();
        c1.cliente = cliente;

        c1.cliente.nome = "Arthur";
        c1.cliente.cpf = "1224";
        c1.cliente.idade = 21;
        c1.cliente.endereço = "Vila Sésamo";

        c1 = new Conta();
    }
}
