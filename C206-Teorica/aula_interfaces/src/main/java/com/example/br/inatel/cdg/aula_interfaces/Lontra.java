package com.example.br.inatel.cdg.aula_interfaces;

public class Lontra extends Mamifero implements Aquatico {

    public Lontra(Double vida, String nome) {
        super(vida, nome);
    }

    @Override
    public void nadar() {
        System.out.println("CONTINUE A NADAR");
        
    }

    @Override
    public void emitirSom() {
        System.out.println("iririi riri riri ri ri umaumaumamaueeeeee");
        
    }

    
    
}
