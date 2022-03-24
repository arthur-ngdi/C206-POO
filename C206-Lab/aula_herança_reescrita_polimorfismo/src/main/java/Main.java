public class Main {
    public static void main(String[] args) {

        Funcionario[]funcionarios = new Funcionario[10];

//      Professor p = new Professor("Pivoto", 22, 1000000, "POO");
        Professor p = new Professor("Pivoto", 22, 1000000, "POO");
        Engenheiro e = new Engenheiro("Arthur" , 21, 10000);
        Arquiteto a = new Arquiteto("Manuzita", 22, 10000);

        funcionarios[0] = e;
        funcionarios[1] = p;
        funcionarios[2] = a;

        for(int i = 0; i < funcionarios.length; i++){
            if(funcionarios != null){
                if(funcionarios[i] instanceof Professor){
                    System.out.println("Nessa posição tem um professor");
                    Professor prof = (Professor)funcionarios[i];
                    prof.mostraInfo();
                    prof.fazendoAlgo();
                    prof.corrigeProvas();
                }else if(funcionarios[i] instanceof Engenheiro){
                    System.out.println("Nessa posição tem um engenheiro");
                    Engenheiro eng = (Engenheiro)funcionarios[i];
                    eng.mostraInfo();
                    eng.fazendoAlgo();
                }else{
                    System.out.println("Nessa posição tem um arquiteto");
                    Arquiteto arq = (Arquiteto) funcionarios[i];
                    arq.mostraInfo();
                    arq.fazendoAlgo();
                }
            }
        }




    }
}
