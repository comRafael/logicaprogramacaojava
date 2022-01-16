package bdws;

public interface Jogada {

    public Tipo getTipo();

    public boolean ehGanhadorDo(Jogada jogada);

    public default String getTipoString() {
        return this.getTipo().toString();
    }
}
