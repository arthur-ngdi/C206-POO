import Arquivo.Arquivo;
import Jogo.Jogo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Arquivo a1 = new Arquivo();
        ArrayList<Jogo> jogos;
        int escolha = 0;


        while(escolha != 5){

            System.out.println("1 - Salvar as informações do jogo no arquivo txt");
            System.out.println("2 - Mostrar as informações dos jogos salvos no arquivo");
            System.out.println("3 - Ordenar os jogos em ordem crescente de preço");
            System.out.println("4 - Ordenar os jogos em ordem decrescente de preço");
            System.out.println("5 - Sair");

            System.out.print("Entre com a sua escolha: ");
            escolha = sc.nextInt();
            sc.nextLine();

            switch (escolha){
                case 1:
                    Jogo j1 = new Jogo();
                    System.out.println("Entre com o nome do jogo: ");
                    j1.setNome(sc.nextLine());

                    System.out.println("Entre com o preço do jogo: ");
                    try{
                        j1.setPreco(sc.nextDouble());
                    }catch (Exception e){}

                    sc.nextLine();

                    System.out.println("Entre com o gênero do jogo: ");
                    j1.setGenero(sc.nextLine());

                    a1.escrever(j1);
                    break;
                case 2:
                    jogos = a1.ler();

                    for(Jogo j: jogos){
                        System.out.println(j.getNome());
                        System.out.println(j.getPreco());
                        System.out.println(j.getGenero());
                    }
                    break;
                case 3:
                    jogos = a1.ler();
                    Collections.sort(jogos);
                    for(Jogo j: jogos){
                        System.out.println(j.getNome());
                        System.out.println(j.getPreco());
                        System.out.println(j.getGenero());
                    }
                    break;
                case 4:
                    jogos = a1.ler();
                    Collections.sort(jogos);
                    Collections.reverse(jogos);
                    for(Jogo j: jogos){
                        System.out.println(j.getNome());
                        System.out.println(j.getPreco());
                        System.out.println(j.getGenero());
                    }
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
            }



        }


    }
}
