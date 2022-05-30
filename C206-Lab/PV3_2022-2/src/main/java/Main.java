import arquivo.Arquivo;
import carrinho.Carrinho;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import exceptions.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Arquivo a1 = new Arquivo();
        int escolha = 0;
        boolean sair = false;


        while(sair != true){

            System.out.println("1 - Salvar as informações de carrinho no arquivo txt");
            System.out.println("2 - Mostrar as informações dos carrinhos salvos no arquivo txt");
            System.out.println("3 - Ordenar os acarrinho em ordem crescente de velocidade");
            System.out.println("4 - Ordenar os carrinhos em ordem decrescente de velocidade");
            System.out.println("5 - Sair");

            System.out.print("Escolha uma opção acima: ");
            escolha = sc.nextInt();
            sc.nextLine();

            switch (escolha){

                case 1:
                    Carrinho lc = new Carrinho();
                    System.out.print("Entre com o nome do jogador: ");
                    lc.setNomeJogador(sc.nextLine());

                    System.out.print("Entre com a velocidade: ");
                    try{
                        lc.setVelocidade(sc.nextInt());
                    }catch (Exception e){
                        break;
                    }

                    System.out.print("Entre com o tipo de chassi (Breakout, Mere ou Octane): ");
                    sc.nextLine();
                    try{
                        lc.setChassi(sc.nextLine());
                    }catch (Exception e){
                        break;
                    }


                     a1.escrever(lc);

                    break;
                case 2:
                    ArrayList<Carrinho> carrinhos = a1.ler();

                    for(Carrinho c: carrinhos){
                        System.out.println(c.getNomeJogador());
                        System.out.println(c.getVelocidade());
                        System.out.println(c.getChassi());
                    }
                    break;

                case 3:
                    carrinhos = a1.ler();
                    Collections.sort(carrinhos);
                    for(Carrinho c: carrinhos){
                        System.out.println(c.getNomeJogador());
                        System.out.println(c.getVelocidade());
                        System.out.println(c.getChassi());
                    }
                    break;
                case 4:
                    carrinhos = a1.ler();
                    Collections.sort(carrinhos);
                    Collections.reverse(carrinhos);
                    for(Carrinho c: carrinhos){
                        System.out.println(c.getNomeJogador());
                        System.out.println(c.getVelocidade());
                        System.out.println(c.getChassi());
                    }
                    break;
                case 5:
                    System.out.println("Saindo...");
                    sair = true;
                    break;
            }
        }

    }
}
