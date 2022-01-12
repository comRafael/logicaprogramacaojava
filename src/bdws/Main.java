package bdws;

public class Main {

    private Player player;
    private Inimigo inimigo;

    public Main(){
        player = new Player();
        player = new Typeone();
        if (player instanceof Typeone) {
            
        }else if(player instanceof Player){

        }
        /*
        if(player == null){
            System.out.println("Uninitiated player");
            player = new Player();
        }
        if(player instanceof Player){
            System.out.println("Jogador iniciado!");
        }
         */
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
