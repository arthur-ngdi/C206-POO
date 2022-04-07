package br.inatel.cdg.personagens;

public abstract class Personagem {

    public static int cont;
    private String nome;
    private int id;
    private int poder;

    public Personagem(String nome, int poder) {
        this.nome = nome;
        this.poder = poder;
        cont++;
        this.id = cont;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public void mostraInfo(){
        System.out.println("O nome do personagem é: " + this.nome);
        System.out.println("O id do personagem é: " + this.id);
        System.out.println("O personagem tem " + this.poder + " de poder");
        System.out.println("Número de persongens criados: " + this.cont);
    }

    public void travarBatalha(){
        poder++;
    }
}
