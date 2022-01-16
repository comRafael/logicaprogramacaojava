package bdws;

import java.util.Random;

public class Jogador {

    private final Random random = new Random();
    private String nome;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Jogada jogar() {
        switch (random.nextInt(3)) {
            case 0 : return new Pedra();
            case 1 : return new Papel();
            case 2 : return new Tesoura();
        }
        return null;
    }
}
