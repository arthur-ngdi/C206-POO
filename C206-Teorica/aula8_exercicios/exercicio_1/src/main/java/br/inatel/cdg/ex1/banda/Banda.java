package br.inatel.cdg.ex1.banda;

import br.inatel.cdg.ex1.empresario.Empresario;
import br.inatel.cdg.ex1.membros.Membro;
import br.inatel.cdg.ex1.musicas.Musica;

public class Banda {

    private String nome, genero;
    private Musica[] musicas;
    private Membro[] membros;
    private Empresario empresario;


    public Banda(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
        musicas = new Musica[10];
        membros = new Membro[10];

    }



    public void setEmpresario(Empresario empresario) {
        this.empresario = empresario;
    }

    public void mostraInfo() {
        System.out.println("Nome da Banda: " + this.nome);
        System.out.println("Genero da Banda: " + this.genero);
        for (Musica musica : musicas) {
            if(musica != null)
                System.out.println("Musicas da Banda: " + musica.getNome());
        }
        for (Membro membro : membros) {
            if(membro != null)
                System.out.println("Membros da Banda: " + membro.getNome());
        }
        System.out.println("O empresário da banda é: " + empresario.getNome());
    }

    public void addMusica(Musica musica) {
        for(int i = 0; i < musicas.length; i++){
            if(musicas[i] == null){
                musicas[i] = musica;
                break;
            }
        }

    }

    public void addMembro(Membro membro) {
        for(int i = 0; i < membros.length; i++){
            if(membros[i] == null){
                membros[i] = membro;
                break;
            }
        }
    }
}
