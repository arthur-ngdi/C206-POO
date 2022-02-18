import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float altura;
        float peso;
        float IML;

        System.out.print("Entre com sua altura: ");
        altura = sc.nextFloat();

        sc.nextLine();

        System.out.print("Entre com seu peso: ");
        peso = sc.nextFloat();

        IML =peso/(altura*altura);

        if(IML <= 18.5) System.out.println("Vocé está abaixo do peso ideal");
            else if(IML <= 24.9) System.out.println("Vocé está no peso ideal, parabéns!");
                else if(IML <= 29.9) System.out.println("Vocé está levemente acima do peso");
                    else if(IML <= 34.9) System.out.println("Obesidade Grau 1");
                        else System.out.println("Obesidade Grau 3 (MÓRBIDA)");
    }
}
