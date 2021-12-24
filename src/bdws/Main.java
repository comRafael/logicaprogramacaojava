package bdws;

public class Main {
    public static void main(String[] args) {
        Papel papel = new Papel();
        Tesoura tesoura = new Tesoura();
        Pedra pedra = new Pedra();

        Juiz juiz = new Juiz();

        juiz.anunciarVencedor(papel, tesoura);
        juiz.anunciarVencedor(pedra, tesoura);
        juiz.anunciarVencedor(tesoura, papel );
        juiz.anunciarVencedor(papel, papel);
        juiz.anunciarVencedor(pedra, papel);
        juiz.anunciarVencedor(papel, pedra);
    }
}
