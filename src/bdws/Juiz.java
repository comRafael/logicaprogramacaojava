package bdws;

public class Juiz {

    public void anunciarVencedor(Jogada j1, Jogada j2){
        System.out.println("JOGADOR 1 "+ j1.getTipoString() + " X JOGADOR 2 "+ j2.getTipoString());
        if(j1.ehGanhadorDo(j2)){
            j1.ganhou();
        } else if(j2.ehGanhadorDo(j1)){
            j2.ganhou();
        } else {
            System.out.println("Empatou!");
        }
        System.out.println("");
    }
}
