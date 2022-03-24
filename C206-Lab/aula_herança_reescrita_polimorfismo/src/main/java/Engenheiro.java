public class Engenheiro extends Funcionario {

    public Engenheiro(String nome, int idade, double salario) {
        super(nome, idade, salario);
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
    }

    @Override
    public void fazendoAlgo() {
        System.out.println(this.getNome() + "Está Fazendo um projeto");
    }
}

