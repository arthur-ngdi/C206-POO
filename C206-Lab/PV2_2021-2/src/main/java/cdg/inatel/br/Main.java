package cdg.inatel.br;

import cdg.inatel.br.acessorios.Pet;
import cdg.inatel.br.acessorios.Skin;
import cdg.inatel.br.tripulantes.Astronauta;
import cdg.inatel.br.tripulantes.Impostor;
import cdg.inatel.br.tripulantes.Tripulante;

public class Main {
    public static void main(String[] args) {

        Astronauta astronautas[] = new Astronauta[10];

        Tripulante t1 = new Tripulante("Arthur","verde");
        Tripulante t2 = new Tripulante("Manuzita","rosa choque");
        Impostor i1 = new Impostor("Matheus", "preto");
        Impostor i2 = new Impostor("Mandinha", "branco");
        Skin s1 = new Skin("veio do forró");
        Pet p1 = new Pet("Crowley");
        Skin s2 = new Skin("timão e pumba");
        Pet p2 = new Pet("Lucy");
        Skin s3 = new Skin("Namo da Marcela");

        t1.skin = s1;
        t1.pet = p1;
        t2.skin = s3;
        i1.skin = s2;
        i1.pet = p2;

        astronautas[0] = t1;
        astronautas[1] = t2;
        astronautas[2] = i1;
        astronautas[3] = i2;

        for(int i = 0; i < astronautas.length; i++){
            if(astronautas[i] != null){
                if(astronautas[i] instanceof Tripulante){
                    Tripulante temp_t = (Tripulante)astronautas[i];
                    temp_t.fazerMissao();
                    temp_t.reparar();
                    temp_t.reportar();
                    temp_t.mostraInfo();
                } else{
                    Impostor temp_i = (Impostor)astronautas[i];
                    temp_i.fazerMissao();
                    temp_i.reparar();
                    temp_i.reportar();
                    temp_i.trancarPortas("Reator");
                    temp_i.usarVentoinha();
                    temp_i.sabotarLuz();
                    temp_i.sabotarOxigenio();
                    temp_i.sabotarReator();
                    temp_i.sabotarComunicação();
                    temp_i.executar();
                    temp_i.mostraInfo();
                }
            }
        }

    }

}
