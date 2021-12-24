package bdws;

public class Tesoura implements Jogada {

    @Override
    public Tipo getTipo() {
        return Tipo.TESOURA;
    }

    public boolean ehGanhadorDo(Jogada jogada) {
        return Tipo.PAPEL.equals(jogada.getTipo());
    }
}
