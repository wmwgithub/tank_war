import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class T {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setSize(800, 600);
        f.setResizable(false);
        f.setTitle("坦克大战");
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
//            点击关闭按钮触发windowClosing事件
            @Override
            public void windowClosing(WindowEvent e) {
//                关闭窗口
                System.exit(0);
            }
        });
    }
}
