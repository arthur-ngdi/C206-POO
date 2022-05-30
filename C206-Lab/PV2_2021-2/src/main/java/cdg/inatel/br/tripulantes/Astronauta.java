package cdg.inatel.br.tripulantes;

import cdg.inatel.br.acessorios.*;


public abstract class Astronauta {

    public static int cont;
    private String cor;
    private String nome;
    public Skin skin;
    public Pet pet;

    public Astronauta(String cor, String nome) {
        this.cor = cor;
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public String getNome() {
        return nome;
    }

    public void mostraInfo(){
        System.out.println("Nome do tripulante: " + this.nome);
        System.out.println("Cor do tripulante: " + this.cor);

        if(skin != null)  System.out.println("Skin do tripulante: " + this.skin.getTipo());
            else System.out.println("O tripulante não tem skin");

        if(pet != null)  System.out.println("Pet do tripulante: " + this.pet.getNome());
        else System.out.println("O tripulante não tem pet");
    }

    public void verCameras(){
        System.out.println(this.nome + " olhou as câmeras");
    }

    public abstract void reportar();

    public abstract void reparar();

}
