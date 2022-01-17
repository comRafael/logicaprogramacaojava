package pack;

import javax.swing.*;
import java.awt.*;

public class Game extends Canvas implements Runnable {
    public static JFrame frame;
    private final int WIDTH = 160;
    private final int HEIGHT = 120;
    private final int SCALE = 4;


    public Game(){
        setPreferredSize(new Dimension(WIDTH*SCALE,HEIGHT*SCALE));
        initFrame();
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

    }

    public static void main(String[] args) {
        Game game = new Game();
    }


    public void run() {

    }
}
