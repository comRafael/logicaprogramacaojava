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
        int vida = 101;
        /*
        >
        <
        >=
        <=
        ==
        !=
         */
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

    }
}