package bdws;

public class Main {
    public static void main(String[] args) {
        Papel papel = new Papel();
        Tesoura tesoura = new Tesoura();
        Pedra pedra = new Pedra();

        Juiz juiz = new Juiz();

        Jogada compara = juiz.comparar(papel, tesoura);
        juiz.comparar(pedra, tesoura);
        juiz.comparar(tesoura, papel );

//        boolean ganhou = papel.ganhou();
//
//
//        Jogada jogada = new Papel();
        System.out.println("Fim");
    }
}
