package inputs;
import java.awt.event.KeyEvent;

import java.awt.event.KeyListener;

import main.GamePanel;

public class KeyBoardInputs implements KeyListener {

    //StringBuilder sb = new StringBuilder();
    private GamePanel gamePanel;
    public KeyBoardInputs(GamePanel gamePanel)
    {
        this.gamePanel = gamePanel;
    }
    @Override
    public void keyTyped(KeyEvent e) {
        // sb.append(e.getKeyChar());
        // System.out.println("Key is pressed: " + sb);
    }

    @Override
    public void keyPressed(KeyEvent e) {


    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Triển khai code 
    
    }
    
}
