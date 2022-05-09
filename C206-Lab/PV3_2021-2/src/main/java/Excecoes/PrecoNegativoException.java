package Excecoes;

public class PrecoNegativoException extends Exception{

    public PrecoNegativoException(){
        System.out.println("Valor negativo não é permitido");
    }
}
