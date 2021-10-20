import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
       int idade = 24;
       System.out.println("Minha idade é "+idade);
       idade = 25;
        System.out.println("Minha idade é "+idade);
        idade = 26;
        System.out.println("Minha idade é "+idade);
        idade = 27;
        System.out.println("Minha idade é "+idade);
        idade = 28;
        System.out.println("Minha idade é "+idade);
        idade = 29;
        System.out.println("Minha idade é "+idade);
        idade = 30;
        System.out.println("Minha idade é "+idade);
         */
        // Tipos de variáveis;
        /*
        int numero = 24000000;
        String frase = "Olá mundo";
        boolean var = true;
        char var2 = 'a';
        double var3 = 24.9;



        System.out.println(numero);
        System.out.println(frase);
        System.out.println(var);
        System.out.println(var2);
        System.out.println(var3);
        */
        //Constantes
        /*
        final int vida_maxima = 10;
        System.out.println(vida_maxima);
         */
        //Arrays
         /*
        String[] nome = new String[5];
        nome[0] = "Halerson";
        nome[1] = "Brendha";


        System.out.println("O nome é "+nome[1]);
        String[][] var2 = new String[5][5];
        var2[0][0] = "Roque";
        System.out.println(var2[0][0]);
        */
        //int vida = 100;
        /*
        >
        <
        >=
        <=
        ==
        !=
         /*
        if (vida < 100) {
            vida += 100;
            System.out.println("Minha vida é maior a 100!");
        } else {
            System.out.println("Minha vida não é igual a 100!");
        }

        String nome = "Brendha";
        if (nome == "Brendha") {
            System.out.println("Nome igual a " + nome);
        } else if (nome == "Roque") {

        } else if (nome == "Thayna") {

        } else {

        }

        if (nome != "Roque") {
            System.out.println("O nome é diferente de Roque");
        }

        boolean var = true;
        if (var)
            System.out.println("Verdade");

        System.out.println("");
        */

        /*
        int vida = 90;

        switch (vida) {
            case 90:
                //Execute alguma ação aqui!
                System.out.println("Quero que meu personagem corra mais rápido!");
                break;
            case 30:
                System.out.println("Minha vida é igual a 30!");
                break;
            default:
                System.out.println("Nenhuma condição bateu! Eu tenho 100 de vida!");
                break;
        }
         */
        /*
        int vida_1 = 100;
        int vida_2 = 100;
        int vida_3 = 50;
        int vida_final = vida_1 + vida_2 + vida_3;

        int vida_final2 = ((vida_1 + vida_2) / 2) * 2;
        System.out.println(vida_final2);
         */
        String nome_jogador = "Brendha";
        int skill = 100;
        /*

        if ((nome_jogador == "Brendha" && skill == 100) && skill <= 90) {
            //podemos executar esse código
            System.out.println("verdade");
        }else {
            System.out.println("entramos no else");

        if ((nome_jogador == "Brendha" || nome_jogador == "Halerson") &&
                skill >= 100) {
            System.out.println("Comece o jogo!");
        }


        /*
        Scanner scanner = new Scanner(System.in);

        System.out.println("V1");

        int V1 = scanner.nextInt();
        System.out.println("V2");
        int V2 = scanner.nextInt();
        int vr = V1+V2;
        if (V2 ==0){
        vr = 0;
        }
        if (V2 ==1){
        vr = V1;
        }
        if (V2 ==2){
        vr = V1 + V1;
        }
        if (V2 ==3){
            vr = V1+V1+V1;
        }
        if (V2 ==4){
            vr = V1+V1+V1+V1;
        }
        if (V2 ==5){
            vr = V1+V1+V1+V1+V1;
        }
        if (V2 ==6){
            vr = V1+V1+V1+V1+V1+V1;
        }
        if (V2 ==7){
            vr = V1+V1+V1+V1+V1+V1+V1;
        }
        if (V2 ==8){
            vr = V1+V1+V1+V1+V1+V1+V1+V1;
        }
        if (V2 ==9){
            vr = V1+V1+V1+V1+V1+V1+V1+V1+V1;
        }
        if (V2 ==10){
            vr = V1+V1+V1+V1+V1+V1+V1+V1+V1+V1;
        }

        System.out.println("Resultado:" + vr);
        */

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("v1");
        int v1 = scanner.nextInt();
        System.out.println("v2");
        int v2 = scanner.nextInt();
        int vr = 0;

//        for(int i = v1; i <= vr; i+=v2){
        for(int i = 1; i <= v1; i++){
            vr= vr + v2;
            vr+=v2;
        }

        System.out.println("Resultado = " + vr);
         */

        Player player = new Player();
        ArrayList<Inimigo> inimigos = new ArrayList<Inimigo>();

        inimigos.add(new Elfinimigo(100));
        inimigos.add(new Elfinimigo(100));
        inimigos.add(new Elfinimigo(100));
        inimigos.add(new Elfinimigo(100));
        inimigos.add(new Elfinimigo(100));

        for(int i = 0; i < inimigos.size();i++){
            Inimigo inimigoLocal = inimigos.get(i);
            if( i == 1){
                inimigoLocal.tomarDano();
                System.out.println(inimigoLocal.vida);
            }else {
             System.out.println(inimigoLocal.vida);
            }
        }



    }
}