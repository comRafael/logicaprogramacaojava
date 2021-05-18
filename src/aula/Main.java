package aula;

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
         */
        if ((nome_jogador == "Brendha" || nome_jogador == "Halerson") &&
                skill >= 100) {
            System.out.println("Comece o jogo!");
        }

    }
}