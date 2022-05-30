package br.inatel.cdg.jogador;
import br.inatel.cdg.Inimigo.Asteroide;

public class Nave {

    private String nome;
    private double vida;
    private String tipoTiro;

    public Nave(String nome, double vida, String tipoTiro) {
        this.nome = nome;
        this.vida = vida;
        this.tipoTiro = tipoTiro;
    }

    public String getNome() {
        return nome;
    }

    public double getVida() {
        return vida;
    }

    public String getTipoTiro() {
        return tipoTiro;
    }

    public void atirar (Asteroide ast){
        if(ast.getTipoAsteroide().equals("Pequeno") || this.tipoTiro.equals("Explosivo")){
            ast.destruir();
        } else System.out.println("Sua nave não consegue destruir esse asteroide");
    }

}
