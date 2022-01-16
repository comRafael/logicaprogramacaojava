package bdws;

public class Juiz {

    public void anunciarVencedor(Jogador jogador1, Jogador jogador2){
        Jogada jogada1 = jogador1.jogar();
        Jogada jogada2 = jogador2.jogar();
        System.out.println(jogador1.getNome() + " " + jogada1.getTipoString() + " X " + jogador2.getNome() + " " + jogada2.getTipoString());
        if(jogada1.ehGanhadorDo(jogada2)){
            anunciar(jogador1, jogada1);
        } else if(jogada2.ehGanhadorDo(jogada1)){
            anunciar(jogador2, jogada2);
        } else {
            System.out.println("Empatou!");
        }
        System.out.println("");
    }

    private void anunciar(Jogador jogador, Jogada jogada) {
        System.out.println(jogador.getNome() + " " + jogada.getTipo().toString() + " e ganhou!");
    }
}
