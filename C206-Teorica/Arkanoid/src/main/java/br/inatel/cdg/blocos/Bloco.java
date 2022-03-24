package br.inatel.cdg.blocos;

public class Bloco {
    private static int numBlocos;

    public static void criarBloco(){
        numBlocos += 10;
    }

    public static void excluirBloco(){
        numBlocos--;
    }
}
