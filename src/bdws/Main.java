package bdws;

public class Main {
    public static void main(String[] args) {
        geradorNumeroPrimoBasico();
    }

    private static void geradorNumeroPrimoBasico() {
        for (int i = 0; i < 100; i++) {
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
        return dividiu <= 0;
    }
}
