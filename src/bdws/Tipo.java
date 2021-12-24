package bdws;

public enum Tipo {
    PEDRA("Pedra"),
    PAPEL("Papel"),
    TESOURA("Tesoura");

    private String nome;

    Tipo(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Jogou: " + nome;
    }
}
