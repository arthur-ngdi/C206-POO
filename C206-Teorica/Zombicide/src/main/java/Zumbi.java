public class Zumbi {

    public double vida;
    public String nome;

    public double getVida(){
        return this.vida;
    }

    public boolean tranfereVida(double valor, Zumbi target){
        if(valor < this.vida) {
            this.vida -= valor;
            target.vida += valor;
            return true;
        }
        return false;
    }
}
