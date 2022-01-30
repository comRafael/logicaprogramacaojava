package bdws;

import java.awt.*;

public class Enemy {
    public double x,y;
    public int width,height;


    public Enemy(int x,int y){
        this.x = x;
        this.y = y;
        this.width = 28;
        this.height = 10;
    }

    public void tick(){
        x+= (Game.ball.x - x - 6) * 0.09;
    }
    public void render(Graphics graphics){
        graphics.setColor(Color.red);
        graphics.fillRect((int)x,(int)y,width,height);
    }
}
