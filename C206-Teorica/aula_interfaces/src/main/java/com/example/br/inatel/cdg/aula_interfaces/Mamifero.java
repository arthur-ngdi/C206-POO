package com.example.br.inatel.cdg.aula_interfaces;

public abstract class Mamifero{

    protected double vida;
    protected String nome;

    public Mamifero(Double vida, String nome) {
        this.vida = vida;
        this.nome = nome;
    }

    public abstract void emitirSom();

    public void mostraInfo(){

        System.out.println("O nome é: " + this.nome);
        System.out.println("A vida é: " + this.vida);
    }
    


    
}