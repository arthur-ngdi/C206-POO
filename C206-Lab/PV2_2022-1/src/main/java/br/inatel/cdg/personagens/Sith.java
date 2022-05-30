package br.inatel.cdg.personagens;
import br.inatel.cdg.armas.Sabre;
import br.inatel.cdg.interfaces.Forca;

public class Sith extends Personagem implements Forca{

    private boolean darth;
    private Sabre sabre;


    public Sith(String nome, int poder, boolean darth) {
        super(nome, poder);
        this.darth = darth;
    }

    public void setSabre(Sabre sabre) {
        this.sabre = sabre;
    }

    public void corromperJedi(){
        if(darth = true && super.getPoder() > 60){
            System.out.println(super.getNome() + " levou um Jedi para o lado negro da força");

        } else System.out.println(super.getNome() + " ainda não consegue corromper Jedis");
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("O personagem é um Sith");
        if(this.darth == true) System.out.println(super.getNome() + " é um Lord Sombrio");
        else System.out.println(super.getNome() + " ainda é um aprendiz dos mistérios do lado sombrio");
        System.out.println("A cor do sabre de luz do "+ super.getNome() + " é " + this.sabre.getCor());


    }

    @Override
    public void travarBatalha() {
        System.out.println(super.getNome() + " travou uma batalha contra um Jedi");
        super.travarBatalha();
    }

    @Override
    public void usarForca() {
        System.out.println(super.getNome() + " usou o lado negro da força");
        super.setPoder(super.getPoder() + 5);
    }

    @Override
    public void trocarSabre(String cor) {
        this.sabre.setCor(cor);
    }
}
