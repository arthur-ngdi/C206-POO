package br.inatel.cdg;

import br.inatel.cdg.armas.Sabre;
import br.inatel.cdg.personagens.*;
import br.inatel.cdg.personagens.Personagem;
import br.inatel.cdg.veiculos.Nave;

public class Main {
    public static void main(String[] args) {
        Sabre sabre1 = new Sabre("verde");
        Sabre sabre2 = new Sabre("azul");
        Sabre sabre3 = new Sabre("vermelho");
        Nave n1 = new Nave("Malevolence", true);
        Jedi j1 = new Jedi("Obi Wan Kenobi", 70, true);
        Jedi j2 = new Jedi("Anakin Skywalker", 40, false);
        Sith s1 = new Sith("Count Dooku (Darth Tyranus)", 70, true);
        Droid d1 = new Droid("General Grievous", 50, true);
        if(Personagem.cont < 3) System.out.println("Deve-se colocar, no mínimo, 3 persongens");

        j1.setSabre(sabre1);
        j2.setSabre(sabre2);
        s1.setSabre(sabre3);

        n1.personagens[0] = j1;
        n1.personagens[1] = j2;
        n1.personagens[2] = s1;
        n1.personagens[3] = d1;

        n1.mostraInfo();


    }
}
