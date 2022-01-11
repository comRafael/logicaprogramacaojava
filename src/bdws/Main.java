package bdws;

public class Main{

    private String nome = "Hello Friend!";
    //private int[] numeros = new int[11];
    private int[] numeros;
    public static final int VIDA_MAXIMA = 100;

    //Metodo Construtor
    public Main(){
        //System.out.println(this.nome);
        //numeros = new int[122];
    }

    public String getNome(){
        return nome;
    }

    public static void main(String[] args) {
        //new Main();
        Main main = new Main();
        System.out.println(Main.VIDA_MAXIMA);
    }

}
