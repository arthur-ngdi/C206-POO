package cdg.inatel.br.tripulantes;

import cdg.inatel.br.acessorios.Pet;
import cdg.inatel.br.acessorios.Skin;
import cdg.inatel.br.acoes.*;

public class Impostor extends Astronauta implements Missao, Sabotar, Executar {

    private int qtdMortes;

    public Impostor(String cor, String nome) {
        super(nome, cor);
    }

    public int getQtdMortes() {
        return qtdMortes;
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Execussões: " + this.qtdMortes);
    }

    @Override
    public void reportar() {
        System.out.println(super.getNome() + " fez um self report");
    }

    @Override
    public void reparar() {
        System.out.println(super.getNome() + " fingiu que fez um reparo");
    }

    @Override
    public void fazerMissao() {
        System.out.println(super.getNome() + " fez uma missão falsa");

    }

    @Override
    public void executar() {
        System.out.println(super.getNome() + " matou um tripulante");
        qtdMortes++;
    }

    @Override
    public void sabotarLuz() {
        System.out.println("O impostor sabotou a luz");
    }

    @Override
    public void sabotarOxigenio() {
        System.out.println("O impostor sabotou o oxigênio");
    }

    @Override
    public void sabotarReator() {
        System.out.println("O impostor sabotou o reator");
    }

    @Override
    public void sabotarComunicação() {
        System.out.println("O impostor sabotou a comunicação");
    }

    public void usarVentoinha(){
        System.out.println("O impostor se escondeu na ventilação");
    }

    public void trancarPortas(String local){
        System.out.println("O impostor trancou as portas do(a) " + local);
    }

}
