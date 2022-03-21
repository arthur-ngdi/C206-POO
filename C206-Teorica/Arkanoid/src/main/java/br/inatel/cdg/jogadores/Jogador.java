package br.inatel.cdg.jogadores;

import br.inatel.cdg.blocos.Bloco;

public class Jogador {

    private String nome;
    private int points;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public int getPoints() {
        return this.points;
    }

    public void destruir(){
        System.out.println("KABUUUUUM");
        Bloco.excluirBloco();
        this.points++;
    }


}
