package main;

import java.awt.Toolkit;

public class Game extends Thread{
    private GameWindow gameWindow;
    private GamePanel gamePanel;
    private final int FPS = 120;
    private Thread gameThread;
    public Game()
    {
        gamePanel = new GamePanel();
        gameWindow = new GameWindow(gamePanel);

        // thiết lập đầu vào ở trạng thái tập trung (focus state)
        gamePanel.requestFocus();
        startGameLoop();
    }


    @Override
    public void run()
    {
        // Thời gian giành cho 1 Frame 
        double dataPerFrame = 1000000000.0 / FPS;
        
        // Lưu thời gian bắt đầu Frame bằng nano giây
        long lastFrame = System.nanoTime();

        // Khai báo biến lưu thời gian hiện tại
        long now;

        // Số Frame 
        int frames = 0;

        // Lấy thời gian hiện tại bằng mili giây
        long lastCheck = System.currentTimeMillis();
        while(true)
        {
            now = System.nanoTime();
            if(now - lastFrame >= dataPerFrame)
            {
                gamePanel.repaint();
                Toolkit.getDefaultToolkit().sync();
                lastFrame = now;
                frames++;
            }
            if((System.currentTimeMillis() - lastCheck) > 1000)
            {
                lastCheck = System.currentTimeMillis();
                System.out.println("FPS: " + frames);
                frames = 0;
            }
        }
    }

    public void startGameLoop()
    {
        gameThread = new Thread(this);
        gameThread.start();
    }
}
