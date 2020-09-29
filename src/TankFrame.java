import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TankFrame extends Frame {
    public TankFrame(){
        setSize(800, 600);
        setResizable(false);
        setTitle("坦克大战");
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            //            点击关闭按钮触发windowClosing事件
            @Override
            public void windowClosing(WindowEvent e) {
//                关闭窗口
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
//        窗口重绘时候调用
        g.fillRect(200,200,50,50);
        System.out.println("print");
    }
}
