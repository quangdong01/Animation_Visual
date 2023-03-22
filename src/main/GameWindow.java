package main;
import javax.swing.JFrame;

public class GameWindow {
    private JFrame jframe;
    public GameWindow(GamePanel gamePanel)
    {        
        // khởi tạo một cửa sổ 
        jframe = new JFrame(); 

        // set tiêu đề cho cửa sổ
        jframe.setTitle("Java Game for Advanced Programming");
        
        //thêm Lớp Panel 
        jframe.add(gamePanel);

        // set kích thước cửa sổ
        jframe.setSize(400, 400);

        // hiển thị cửa sổ ở chính giữa 
        jframe.setLocationRelativeTo(null);

        // cho phép hiện thị cửa sổ 
        jframe.setVisible(true);

        // kết thúc hoàn toàn chương trình khi nhấn 'X' ở cửa sổ 
        // nếu không thêm dòng code này thì khi nhấn 'X' trên cửa sổ
        // thì cửa sổ vẫn đóng, tuy nhiên chương trình không kết thúc
        // mà vẫn chạy ngầm
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }



}
