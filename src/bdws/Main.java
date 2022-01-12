package bdws;

public class Main {

    private Player player;
    private Inimigo inimigo;

    public Main(){
        player = new Player();
        inimigo = new Inimigo();
    }

    public Player getPlayer(){
        return player;
    }

    public Inimigo getInimigo(){
        return inimigo;
    }


    public static void main(String[] args) {

        Main main = new Main();
        Player player = main.getPlayer();
        player.atacarInimigo(main.getInimigo());
        System.out.println(main.getInimigo().life);
    }

}
