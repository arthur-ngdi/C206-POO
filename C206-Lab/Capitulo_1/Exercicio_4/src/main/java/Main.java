import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int senhaCorreta = 2002;
        int senha;
        boolean valida = false;

        System.out.print("Entre com a senha: ");
        senha = sc.nextInt();

        while (valida == false){

            if(senha == senhaCorreta){
                System.out.println("Acesso Permitido!");
                valida = true;
            } else {
                System.out.println("Acesso Negado!");
                System.out.print("Entre com a senha: ");
                senha = sc.nextInt();
            }

        }
    }
}
