package bdws;

public class Main{

    private static int metodo(){
        return 10;

    }

    private static String metodo2(){
        return "Hello Friend";

    }

    public void metodo3(int[] n1, String[] nome){
        System.out.println(n1[0]);
        System.out.println(nome[0]);
    }

    public static void main(String[] args) {
      /*  new Player2().nascer();
        Player2 player2 = new Player2();
        player2.nascer();

        Main main = new Main();
        //main.metodo();
        metodo();
       */
        //System.out.println(metodo2());

        int[] n1 = new int[10];
        n1[0] = 10;
        String[] nomes = new String[2];
        nomes[0] = "Number1";
        new Main().metodo3(n1,nomes);

    }

}
