package bdws;

public class Main {
    public static void main(String[] args) {
        Juiz juiz = new Juiz();

        Jogador j1 = new Jogador("João");
        Jogador j2 = new Jogador("Maria");

        for (int i = 0; i < 100; i++) {
            juiz.anunciarVencedor(j1, j2);
        }
    }
}
