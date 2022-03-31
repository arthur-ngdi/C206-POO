package br.inatel.cdg;

import br.inatel.cdg.coins.Conversor;
import br.inatel.cdg.jogadores.Jogador;

public class Main {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Arthur");
        Jogador j2 = new Jogador("Manuzita");

        j1.destruir();
        j1.destruir();
        j1.destruir();
        j1.destruir();
        j2.destruir();
        j2.destruir();
        j2.destruir();
        j2.destruir();

        System.out.println(j1.getPoints());
        System.out.println(j2.getPoints());
        System.out.println(Conversor.quantidadeMoedas(j1));
        System.out.println(Conversor.quantidadeMoedas(j2));
    }
}
