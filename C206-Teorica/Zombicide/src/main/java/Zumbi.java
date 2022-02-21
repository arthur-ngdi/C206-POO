public class Zumbi {

    public double vida;
    public String nome;

    public double getVida(){
        return this.vida;
    }

    public boolean tranfereVida(double valor, Zumbi target){
        if(valor < this.vida) {
            System.out.println("Tranferindo vida");
            this.vida -= valor;
            target.vida += valor;
            return true;
        }
        System.out.println("Vida insuficiente pra tranferir");
        return false;
    }
}
