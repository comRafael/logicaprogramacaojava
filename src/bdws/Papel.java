package bdws;

public class Papel implements Jogada {

    @Override
    public Tipo getTipo() {
        return Tipo.PAPEL;
    }

    public boolean ehGanhadorDo(Jogada jogada) {
        return Tipo.PEDRA.equals(jogada.getTipo());
    }
}
