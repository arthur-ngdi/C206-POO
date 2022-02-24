public class Funcionario {
    String nome;
    int idade;
    int cpf;
    double salario;


    static int numeroFuncionarios = 0;

    Funcionario(String nome, int idade, int cpf, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.salario = salario;
        numeroFuncionarios++;
        System.out.println("Funcionário efetivado");
        System.out.println(numeroFuncionarios);
    }

    void tirarFerias(){
        System.out.println("Tirou Férias!");
    }

    void mostraInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("idade: " + this.idade);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Salário: " + this.salario);
    }


}
