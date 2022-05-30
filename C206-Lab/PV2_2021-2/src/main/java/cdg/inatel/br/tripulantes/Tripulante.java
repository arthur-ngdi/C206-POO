package cdg.inatel.br.tripulantes;

import cdg.inatel.br.acoes.Missao;
import cdg.inatel.br.acessorios.*;

public class Tripulante extends Astronauta implements Missao {


    private int qtdMissoes = 10;

    public Tripulante(String nome, String cor) {
        super(cor, nome);

    }

    public int getQtdMissoes() {
        return qtdMissoes;
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Missões realizadas: " + (10 - this.qtdMissoes));
    }

    @Override
    public void reportar() {
        System.out.println(super.getNome() + " reportou um corpo");
    }

    @Override
    public void reparar() {
        System.out.println(super.getNome() + " fez um reparo");
    }

    @Override
    public void fazerMissao() {
        System.out.println(super.getNome() + "fez uma missão");
        qtdMissoes--;
    }
}
