package main;

import javax.swing.JPanel;
import inputs.KeyBoardInputs;
import inputs.MouseInputs;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import java.awt.Color;
import java.util.ArrayList;

            
public class GamePanel extends JPanel 
{
    ArrayList<MyRect> rects = new ArrayList<MyRect>();

    private KeyBoardInputs keyboardinputs;
    private MouseInputs mouseinputs;

    public GamePanel()
    {   
        mouseinputs = new MouseInputs(this);
        addKeyListener(new KeyBoardInputs(this));
        addMouseMotionListener(mouseinputs);
        addMouseListener(mouseinputs);
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        for(MyRect rect : rects)
        {
            rect.updateRectangle();
            rect.draw(g);
        }
       
    }

    public void spawRect(int x, int y)
        {
            rects.add(new MyRect(x, y)); 
        }

    public class MyRect
    {
        private int x, y, h, z;
        private Color color;
        private int xReset = 1, yReset = 1;
        private Random random;
        // update Rectangle khi va vào tường
        public MyRect(int x, int y)
        {
            random = new Random();
            this.x = x;
            this.y = y;
            h = random.nextInt(50);
            z = h;
            color = new Color(150, 150, 150);
        }
        public void updateRectangle()
        {
            this.x += xReset;
            if(this.x > 400 || this.x < 0)
            {
                xReset *= -1;
                color = setRGBColor();
            }
            this.y += yReset;
            if(this.y > 400 || this.y < 0)
            {
                yReset *= -1;
                color = setRGBColor();
            }
        }
        // thiết lập màu cho Rectangle
        private Color setRGBColor()
        {
            Random random = new Random();
            int x = random.nextInt(255);
            int y = random.nextInt(255);
            int z = random.nextInt(255);
            return new Color(x, y, z);
        }

        public void draw(Graphics g)
        {
            g.fillRect((int)this.x, (int)this.y, (int)this.h, (int)this.z);
            g.setColor(color);
        }
    }
}
