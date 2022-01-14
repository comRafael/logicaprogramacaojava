package pack;

public class Main implements Runnable{
    private boolean isRunning;
    private Thread thread;

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
            atualizar();
            render();
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
