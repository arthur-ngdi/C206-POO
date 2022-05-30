package br.inatel.cdg.ex1.membros;

public class Membro {

    private String nome, funcao;

    public String getNome() {
        return nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public Membro(String nome, String funcao) {
        this.nome = nome;
        this.funcao = funcao;
    }
}
