package br.inatel.cdg;

import br.inatel.cdg.Inimigo.Asteroide;
import br.inatel.cdg.jogador.Nave;

public class Main {
    public static void main(String[] args) {

        Nave n1  = new Nave("Millenium Falcon", 1000 , "Explosivo");
        Nave n2 = new Nave("Star Destroyer", 500, "Normal");
        Asteroide a1 = new Asteroide("xablau", "Pequeno");
        Asteroide a2 = new Asteroide(" bailar la bomba", "Grande");

        n1.atirar(a1);
        n2.atirar(a1);

        n1.atirar(a2);
        n2.atirar(a2);

    }
}
