package pack;

import java.util.ArrayList;

public class Main implements Runnable{
    private boolean isRunning;
    private Thread thread;

    private ArrayList<Entidade> entidades = new ArrayList<>();

    public Main(){
        entidades.add(new Entidade());
        entidades.add(new Entidade());
        entidades.add(new Entidade());
        entidades.add(new Entidade());
        entidades.add(new Entidade());
        entidades.add(new Entidade());
        entidades.add(new Entidade());
        entidades.add(new Entidade());
        entidades.add(new Entidade());
        entidades.add(new Entidade());
        entidades.add(new Entidade());
        entidades.add(new Entidade());
        entidades.add(new Entidade());
        for(int i = 0;i < entidades.size();i++){
            Entidade entidade = entidades.get(0);

        }


    }

    public static void main(String[] args) {
        Main main = new Main();
        main.start();


    }

    public synchronized void start(){
        isRunning = true;
        thread = new Thread(this);
        thread.start();
    }

    public void atualizar(){
        System.out.println("Atualizar");
    }
    public void render(){
        System.out.println("Renderizar");
    }

    public void run() {
        while (isRunning){
           // atualizar();
            //render();
            /*
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
             */
        }

    }
}
