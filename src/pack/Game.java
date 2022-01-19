package pack;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

public class Game extends Canvas implements Runnable {
    public static JFrame frame;
    private Thread thread;
    private boolean isRunning = true;
    private final int WIDTH = 240;
    private final int HEIGHT = 160;
    private final int SCALE = 3;

    private BufferedImage image;


    public Game(){
        setPreferredSize(new Dimension(WIDTH*SCALE,HEIGHT*SCALE));
        initFrame();
        image = new BufferedImage(WIDTH,HEIGHT,BufferedImage.TYPE_INT_RGB);
    }

    public void initFrame(){
        frame = new JFrame();
        frame.add(this);
        frame.setResizable(false);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public synchronized void start(){
        thread = new Thread(this);
        isRunning = true;
        thread.start();
    }

    public synchronized void stop(){
        isRunning = false;
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }

    public void tick(){

    }

    public void render (){
        BufferStrategy bs = this.getBufferStrategy();
        if(bs == null){
            this.createBufferStrategy(3);
            return;
        }
        Graphics g = image.getGraphics();
        g.setColor(new Color(2,2,2));
        g.fillRect(0,0,WIDTH,HEIGHT);


        g.setFont(new Font("Arial",Font.BOLD,20));
        g.setColor(Color.white);
        g.drawString("Hello World 😎",40,20);
        /*
         g.setColor(Color.GRAY);
        g.fillRect(22,22,20,20);
        g.setColor(Color.RED);
        g.fillRect(42,42,20,20);
        g.setColor(Color.GREEN);
        g.fillRect(62,62,20,20);
        g.setColor(Color.YELLOW);
        g.fillRect(82,82,20,20);
        g.setColor(Color.BLUE);
        g.fillRect(102,62,20,20);
        g.setColor(Color.ORANGE);
        g.fillRect(122,42,20,20);
         */
        //g.setColor(Color.white);
        //g.fillOval(50,20,30,30);

        g = bs.getDrawGraphics();
        g.drawImage(image,0,0,WIDTH*SCALE,HEIGHT*SCALE,null);
        bs.show();
    }


    public void run() {
        long lastTime = System.nanoTime();
        double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks;
        double delta  = 0;
        int frames = 0;
        double timer = System.currentTimeMillis();
        while(isRunning){
            long now = System.nanoTime();
            delta+= (now - lastTime) / ns;
            lastTime = now;

            if (delta >= 1) {
                tick();
                render();
                frames++;
                delta--;
            }

            if(System.currentTimeMillis()- timer >= 1000){
                System.out.println("FPS: " + frames);
                frames = 0;
                timer+=1000;
            }
        }
        stop();
    }
}
