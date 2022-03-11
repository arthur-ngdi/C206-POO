import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int escolha;

        Deck deck1 = new Deck("Arthur");
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem Vindo ao Gwent!");
        System.out.println("MENU DO JOGO:");
        System.out.println("1 - Adicionar carta no Deck");
        System.out.println("2 - Mostrar as informações do Deck e das cartas presentes nele");
        System.out.println("3 - Mostrar o tipo em maior quantidade no Deck");
        System.out.println("4 - Mostrar a média aritmética de poder em cada tipo");
        System.out.println("5 - Sair do jogo");

        escolha = sc.nextInt();
        sc.nextLine();

        while(escolha != 5) {




            if (escolha == 1) {
                String nome = "";
                String tipo = "";
                double poder = 0.0;
                String tipo_arma = "";

                System.out.println("Entre com o nome da carta: ");
                nome = sc.nextLine();
                System.out.println("Entre com o nome da tipo: ");
                tipo = sc.nextLine();
                System.out.println("Entre com o poder: ");
                poder = sc.nextDouble();
                sc.nextLine();
                System.out.println("Entre com o nome da arma: ");
                tipo_arma = sc.nextLine();

                Carta carta = new Carta(nome, tipo, poder, tipo_arma);
                deck1.addCarta(carta);
            } else if (escolha == 2) {
                System.out.println("Segue, abaixo as informações do deck");
                deck1.mostraInfo();
            } else if (escolha == 3) {
                System.out.println("O maior tipo é :");
                deck1.maiorQuantidade();
            } else if (escolha == 4) {
                System.out.println("A média do poder por tipo é: ");
                deck1.mediaTipos();
            }

            System.out.println("1 - Adicionar carta no Deck");
            System.out.println("2 - Mostrar as informações do Deck e das cartas presentes nele");
            System.out.println("3 - Mostrar o tipo em maior quantidade no Deck");
            System.out.println("4 - Mostrar a média aritmética de poder em cada tipo");
            System.out.println("5 - Sair do jogo");

            escolha = sc.nextInt();
            sc.nextLine();

        }
    }
}
