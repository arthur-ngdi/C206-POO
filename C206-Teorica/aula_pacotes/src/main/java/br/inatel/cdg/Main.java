package br.inatel.cdg;
import br.inatel.cdg.matematica.Matematica;

public class Main {
    public static void main(String[] args) {

//      fully-qualified name
        br.inatel.cdg.matematica.Matematica matematica = new br.inatel.cdg.matematica.Matematica();

//        com import

        Matematica matematica1 = new Matematica();
        br.inatel.cdg.outraMatematica.Matematica matematica2 = new br.inatel.cdg.outraMatematica.Matematica();
    }
}
