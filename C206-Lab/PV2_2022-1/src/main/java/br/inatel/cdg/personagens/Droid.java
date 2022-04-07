package br.inatel.cdg.personagens;

public class Droid extends Personagem {

    private boolean hostil;


    public Droid(String nome, int poder, boolean hostil) {
        super(nome, poder);
        this.hostil = hostil;
    }

    public void hackearSistema(){
        System.out.println(super.getNome() + " hackeou o sistema da nave");
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("O personagem é um droid");
        if(this.hostil == true) System.out.println(super.getNome() + " é hostil");
            else System.out.println(super.getNome() + " é amigável");

    }

    @Override
    public void travarBatalha() {
        if(this.hostil != true) System.out.println(super.getNome() + " travou uma batalha contra um Sith");
            else System.out.println(super.getNome() + " travou uma batalha contra um Jedi");
        super.travarBatalha();
    }
}
