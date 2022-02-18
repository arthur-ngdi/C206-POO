import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float primeiroNumero;
        float segundoNumero;
        short opcao;

        System.out.println("----CALCULADORA NO JAVINHA----");

        System.out.println("Entre com o primeiro número: ");
        primeiroNumero = sc.nextFloat();

        System.out.print("Entre com o segundo número: ");
        segundoNumero = sc.nextFloat();

        System.out.println("Escolha uma das opções listadas abaixo: ");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Exponenciação");
        System.out.println("Escolha: ");

        opcao = sc.nextShort();

        switch (opcao){
            case 1:
                System.out.println("O resultado da soma é: " + (primeiroNumero + segundoNumero));
                break;
            case 2:
                System.out.println("O resultado da subtração é: " + (primeiroNumero - segundoNumero));
                break;
            case 3:
                System.out.println("O resultado da Multiplicação é: " + (primeiroNumero * segundoNumero));
                break;
            case 4:
                System.out.println("O resultado da Divisão é: " + (primeiroNumero / segundoNumero));
                break;
            case 5:
                System.out.println("O resultado da exponeciação é: " + (pow(primeiroNumero, segundoNumero)));
                break;
            default:
                System.out.println("Essa não é uma opção válida!");
        }


    }

}
