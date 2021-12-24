package bdws;

public class Juiz {

    public Jogada comparar(Jogada j1, Jogada j2){

        if (j2 instanceof Papel) {
            if (j1 instanceof Pedra) {
                return j2;
            }
        }
        return j1;
    }
}
