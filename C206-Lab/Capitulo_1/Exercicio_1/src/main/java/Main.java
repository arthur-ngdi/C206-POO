import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String operador;
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com operador E ou OU: ");
        operador = sc.nextLine();

        if(operador.equals("OU")){
            System.out.println("0 " + operador + " 0" + " =" + " 0");
            System.out.println("0 " + operador + " 1" + " =" + " 1");
            System.out.println("1 " + operador + " 0" + " =" + " 1");
            System.out.println("1 " + operador + " 1" + " =" + " 1");
        } else{
            System.out.println("0 " + operador + " 0" + " =" + " 0");
            System.out.println("0 " + operador + " 1" + " =" + " 0");
            System.out.println("1 " + operador + " 0" + " =" + " 0");
            System.out.println("1 " + operador + " 1" + " =" + " 1");
        }
    }
}
