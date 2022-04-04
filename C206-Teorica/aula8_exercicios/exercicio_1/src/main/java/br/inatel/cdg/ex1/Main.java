package br.inatel.cdg.ex1;

import br.inatel.cdg.ex1.banda.Banda;
import br.inatel.cdg.ex1.empresario.Empresario;
import br.inatel.cdg.ex1.membros.Membro;
import br.inatel.cdg.ex1.musicas.Musica;

public class Main {
    public static void main(String[] args) {
        Banda b1 = new Banda("INXS", "Rock");
        Musica m1 = new Musica("Never Tear us Apart", 3.30);
        Musica m2 = new Musica("By my side", 3.30);
        Musica m3 = new Musica("Don't Change", 3.30);
        Membro membro1 = new Membro("Michael Hutchence", "vocalista");
        Empresario e1 = new Empresario("Chris Murphy", 111111111);


        b1.addMembro(membro1);
        b1.setEmpresario(e1);
        b1.addMusica(m1);
        b1.addMusica(m2);
        b1.addMusica(m3);

        b1.mostraInfo();
    }
}
