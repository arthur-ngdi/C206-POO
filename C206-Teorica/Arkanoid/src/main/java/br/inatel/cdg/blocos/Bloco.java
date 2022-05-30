package br.inatel.cdg.blocos;

public class Bloco {
    private static int numBlocos;

    public static void criarBloco(){
        numBlocos += 2;
    }

    public static void excluirBloco(){
        numBlocos--;
    }

    public static int getNumBlocos() {
        return numBlocos;
    }
}
