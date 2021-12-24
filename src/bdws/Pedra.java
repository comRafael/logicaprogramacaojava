package bdws;

public class Pedra implements Jogada {

    @Override
    public Tipo getTipo() {
        return Tipo.PEDRA;
    }

    public boolean ehGanhadorDo(Jogada jogada) {
        return Tipo.TESOURA.equals(jogada.getTipo());
    }
}
