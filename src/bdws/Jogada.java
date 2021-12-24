package bdws;

public interface Jogada {

    public Tipo getTipo();

    public boolean ehGanhadorDo(Jogada jogada);

    public default void ganhou() {
        System.out.println(this.getTipo().toString() + " e ganhou!");
    }

    public default String getTipoString() {
        return this.getTipo().toString();
    }
}
