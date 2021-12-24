package bdws;

import java.util.Arrays;
import java.util.List;

public class Main {

    private static final int numaroMaximoTestar = 1000;
    private static final List<Integer> divisores = Arrays.asList(2, 3, 5, 7);

    public static void main(String[] args) {
//        geradorNumeroPrimoBasico();
//        geradorNumeroPrimoMelhor();
        compararResultados();
        System.out.println("isNumeroPrimoBasico = " + isNumeroPrimoBasico(121));
        System.out.println("isNumeroPrimoMelhor = " + isNumeroPrimoMelhor(121));
    }

    private static void compararResultados(){
        for (int i = 0; i <= numaroMaximoTestar; i++){
            if (isNumeroPrimoMelhor(i) != isNumeroPrimoBasico(i)) {
                System.out.println("Houve divergencia no resultado do valor: " + i);
            }
        }
        System.out.println("Finalizou");
    }

    private static void geradorNumeroPrimoMelhor() {
        for (int i = 0; i < numaroMaximoTestar; i++) {
            if (isNumeroPrimoMelhor(i)){
                System.out.println(i);
            }
        }
    }

    private static boolean isNumeroPrimoMelhor(int numero) {
        if (numero < 11) {
            if (numero == 2 ||numero == 3 ||numero == 5 ||numero == 7 ) {
                return true;
            }
            return false;
        }

        for (int i = 0; i < divisores.size(); i++) {
            if (numero % divisores.get(i) == 0){
                return false;
            }
        }

        return true;
    }
    private static void geradorNumeroPrimoBasico() {
        for (int i = 0; i < numaroMaximoTestar; i++) {
            if (isNumeroPrimoBasico(i)){
                System.out.println(i);
            }
        }
    }

    private static boolean isNumeroPrimoBasico(int numero) {
        if (numero < 2) {
            return false;
        }
        int metadeNumero = numero / 2;
        int dividiu = 0;
        for (int i = 2; i <= metadeNumero ; i++) {
            if (numero%i ==0){
                dividiu++;
            }
        }
        return dividiu == 0;
    }
}
