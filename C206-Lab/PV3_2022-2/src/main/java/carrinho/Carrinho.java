package carrinho;

import exceptions.InfoInvalidaException;

public class Carrinho implements Comparable<Carrinho> {

   private String nomeJogador;
   private int velocidade;
   private String chassi;

    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) throws InfoInvalidaException {

        if(velocidade < 0){
            throw new InfoInvalidaException();
        }else this.velocidade = velocidade;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) throws InfoInvalidaException {
        if(chassi.equals("Breakout") || chassi.equals("Mere") || chassi.equals("Octane")){
            this.chassi = chassi;
        }else throw new InfoInvalidaException();
    }

    @Override
    public int compareTo(Carrinho c) {
        return Integer.compare(this.velocidade, c.velocidade);
    }
}
