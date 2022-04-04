package br.inatel.cdg.ex1.empresario;

public class Empresario {

   private String nome;
   private long cnpj;

    public String getNome() {
        return nome;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public Empresario(String nome, long cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }
}
