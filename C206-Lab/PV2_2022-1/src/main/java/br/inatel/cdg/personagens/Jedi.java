package br.inatel.cdg.personagens;
import br.inatel.cdg.armas.Sabre;
import br.inatel.cdg.interfaces.*;

public class Jedi extends Personagem implements Treinamento, Forca{

    private boolean mestre;
    private Sabre sabre;

    public Jedi(String nome, int poder, boolean mestre) {
        super(nome,poder);
        this.mestre = mestre;

    }

    public void setSabre(Sabre sabre) {
        this.sabre = sabre;
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("O personagem é um Jedi");
        if(this.mestre == true) System.out.println(super.getNome() + " é um Mestre Jedi");
        else System.out.println(super.getNome() + " ainda é um Padawan");
        System.out.println("A cor do sabre de luz do "+ super.getNome() + " é " + this.sabre.getCor());


    }

    @Override
    public void travarBatalha() {
        System.out.println(super.getNome() + " travou uma batalha contra um Sith");
        super.travarBatalha();
    }

    @Override
    public void usarForca() {
        System.out.println(super.getNome() + " usou a força para o bem");
        super.setPoder(super.getPoder()+5);
    }

    @Override
    public void trocarSabre(String cor){
        this.sabre.setCor(cor);
    }

    @Override
    public void treinarPadawan() {
        if(this.mestre == true || super.getPoder() > 70) System.out.println(super.getNome() + " treinou um padawan");
            else System.out.println(super.getNome() + " ainda não consegue treinar padawans");
    }
}
