public class Nave {
    public static int cont = 0;
    public int vida;
    private int numNaves;
    private String nome;

    public Nave() {
        this.vida = 100;
        cont++;
    }

    public Nave(String nome) {
        this.nome = nome;
        this.numNaves++;
    }

    public void mostraInfo() {
        System.out.println(vida);
    }

    public void trocaVida(Nave nave) {
        this.vida = nave.getVida();
        nave.setVida(this.vida);
    }//Getter e Setter omitido

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getNumNaves() {
        return numNaves;
    }

    public void setNumNaves(int numNaves) {
        this.numNaves = numNaves;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}