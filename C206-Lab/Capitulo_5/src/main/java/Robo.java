public class Robo {

    public static int cont;
    public String nome;
    public int nSerie;

    public Robo(String nome){
        this.nome = nome;
        cont++;
        this.nSerie = cont;
    }

    public void mostraInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Némero de Série: " + nSerie);
    }
}
