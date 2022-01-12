package bdws;

public class Main extends Player{

    private String nome = "Hello Friend!";
    //private int[] numeros = new int[11];
    private int[] numeros;
    public static final int VIDA_MAXIMA = 100;

    //Metodo Construtor
    public Main(int n1, int n2){
        super(n1,n2);
        this.vidaInicial = 121;
        //System.out.println(this.nome);
        //numeros = new int[122];
    }

    public String getNome(){
        return nome;
    }

    public static void main(String[] args) {
        //new Main();
        Main main = new Main(100,200);
        System.out.println(Main.VIDA_MAXIMA);
    }

}
