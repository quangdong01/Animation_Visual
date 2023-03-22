package inputs;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import main.GamePanel;


public class MouseInputs implements MouseListener, MouseMotionListener
{
    private GamePanel gamepanel;
    public MouseInputs(GamePanel gamePanel)
    {
        this.gamepanel = gamePanel;
    }
    @Override
    public void mouseDragged(MouseEvent e) {
        // System.out.println("Mouse dragged!! ");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // System.out.println("Mouse moved !! ");
        // gamepanel.setRectPos(e.getX(), e.getY());
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        gamepanel.spawRect(e.getX(), e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // System.out.println("Mouse pressed !!");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // System.out.println("Mouse released !!");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // System.out.println("Mouse entered !!");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // System.out.println("Mouse exited");
    }
    
}
