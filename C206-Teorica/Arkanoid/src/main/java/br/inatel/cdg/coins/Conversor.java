package br.inatel.cdg.coins;
import br.inatel.cdg.jogadores.Jogador;
import org.jetbrains.annotations.NotNull;

public class Conversor {

    public static int quantidadeMoedas(Jogador jogador){
        return (jogador.getPoints()*100);
    }
}
