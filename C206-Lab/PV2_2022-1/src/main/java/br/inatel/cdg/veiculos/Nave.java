package br.inatel.cdg.veiculos;
import br.inatel.cdg.personagens.*;

public class Nave {
    private String nome;
    public Personagem[] personagens = new Personagem[30];
    private boolean velocidadeLuz;

    public Nave(String nome, boolean velocidadeLuz) {
        this.nome = nome;
        this.velocidadeLuz = velocidadeLuz;
    }

    public void mostraInfo(){
        int contagem = 0;
        System.out.println("O nome da nave é: " + this.nome);
        if(velocidadeLuz == true) System.out.println("A nave viaja na velocidade da luz");
            else System.out.println("A nave não viaja na velocidade da luz");
        System.out.println("Os personagens na nave são: ");
        while(contagem < personagens.length && personagens[contagem] != null ){
            System.out.println(personagens[contagem].getNome());
            contagem++;
        }
        for(int i = 0; i < personagens.length; i++){

                if(personagens[i] instanceof Jedi){
                    Jedi temp_j = (Jedi)personagens[i];
                    temp_j.travarBatalha();
                    temp_j.usarForca();
                    temp_j.treinarPadawan();
                    temp_j.trocarSabre("azul");
                    temp_j.mostraInfo();
                } else if(personagens[i] instanceof Sith){
                    Sith temp_s = (Sith)personagens[i];
                    temp_s.travarBatalha();
                    temp_s.usarForca();
                    temp_s.trocarSabre("rosa choque");
                    temp_s.mostraInfo();
                } else{
                    Droid temp_d = (Droid)personagens[i];
                    temp_d.hackearSistema();
                    temp_d.travarBatalha();
                    temp_d.mostraInfo();

                }
            }
            System.out.println("A quantidade de personagens é: " + Personagem.cont);
        }

    }

