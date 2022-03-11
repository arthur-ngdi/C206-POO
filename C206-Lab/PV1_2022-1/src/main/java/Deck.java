public class Deck {
    String dono;
    Carta[] cartas;



    public Deck(String dono){
        this.dono = dono;
        this.cartas = new Carta[100];
    }

    void mostraInfo(){
        System.out.println("Dono: " + dono);
        for(int i = 0; i < cartas.length; i++){
            if(cartas[i] != null){
                this.cartas[i].mostraInfo();
            }
        }

    }

    void addCarta(Carta carta){
        for(int i = 0; i < this.cartas.length; i++){
            if(cartas[i] != null){
                cartas[i] = carta;
                break;
            }
        }

    }

    String maiorQuantidade(){

        int contSoldado = 0;
        int contArqueiro = 0;
        int contPesado = 0;
        int maior = -110;
        String quantidade = null;

        for(int i = 0; i < this.cartas.length; i++){
            if(cartas[i].tipo.equals("Soldado")){
                contSoldado += 1;
                if(maior < contSoldado){
                    maior = contSoldado;
                    quantidade = cartas[i].tipo;
                }
            }else if(cartas[i].tipo.equals("Arqueiro")){
                contArqueiro += 1;
                if(maior < contSoldado){
                    maior = contSoldado;
                    quantidade = cartas[i].tipo;
                }
            }else if(cartas[i].tipo.equals("Pesado")){
                contPesado += 1;
                if(maior < contSoldado){
                    maior = contSoldado;
                    quantidade = cartas[i].tipo;
                }
            }

        }

        return quantidade;
    }

    void mediaTipos(){
        int contSoldado = 0;
        int contArqueiro= 0;
        int contPesado = 0;
        double poderSoldado = 0;
        double poderArqueiro = 0;
        double poderPesado = 0;
        double mediaSoldado = 0;
        double mediaArqueiro = 0;
        double mediaPesado = 0;
        double total = 0;

        for(int i = 0; i < this.cartas.length; i++){
            if(cartas[i].tipo.equals("Soldado")){
                contSoldado += 1;
                poderSoldado += cartas[i].poder;

            }else if(cartas[i].tipo.equals("Arqueiro")){
                contArqueiro += 1;
                poderArqueiro += cartas[1].poder;

            }else if(cartas[i].tipo.equals("Pesado")){
                contPesado += 1;
                poderPesado += cartas[i].poder;

            }

        }
        mediaSoldado = poderSoldado/contSoldado;
        mediaArqueiro = poderArqueiro/contArqueiro;
        mediaPesado = poderPesado/contPesado;

        System.out.println("A média de poder dos Soldados é: " + mediaSoldado);
        System.out.println("A média de poder dos Arqueiros é: " + mediaArqueiro);
        System.out.println("A média de poder dos Pesados é: " + mediaPesado);

    }
}
