package br.inatel.cdg.blocos;

public class Bloco {
    private static int numBlocos;

    public static void criarBloco(){
        numBlocos++;
    }

    public static void excluirBloco(){
        numBlocos--;
    }
}
