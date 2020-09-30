import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TankFrame extends Frame {

    Tank myTank = new Tank(200,200,Dir.DOWN);
    public TankFrame() {
        setSize(800, 600);
        setResizable(false);
        setTitle("坦克大战");
        setVisible(true);
        addKeyListener(new MyKeyListener());
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
//        窗口重绘时候调用,
        myTank.paint(g);
    }

    //    处理键盘监听事件的类
    class MyKeyListener extends KeyAdapter {
        boolean bL = false;
        boolean bU = false;
        boolean bR = false;
        boolean bD = false;

        //    按下某个按键
        @Override
        public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();
            switch (key) {
                case KeyEvent.VK_LEFT:
                    bL = true;
                    break;
                case KeyEvent.VK_UP:
                    bU = true;
                    break;
                case KeyEvent.VK_RIGHT:
                    bR = true;
                    break;
                case KeyEvent.VK_DOWN:
                    bD = true;
                    break;
                default:
                    break;
            }
//            设置坦克方向
            setMainTankDir();
        }

        // 释放某个按键
        @Override
        public void keyReleased(KeyEvent e) {
            int key = e.getKeyCode();
            switch (key) {
                case KeyEvent.VK_LEFT:
                    bL = false;
                    break;
                case KeyEvent.VK_UP:
                    bU = false;
                    break;
                case KeyEvent.VK_RIGHT:
                    bR = false;
                    break;
                case KeyEvent.VK_DOWN:
                    bD = false;
                    break;
                default:
                    break;
            }
            //            设置坦克方向
            setMainTankDir();
        }

        private void setMainTankDir() {
            if (bL) myTank.setDir(Dir.LEFT);
            if (bU)  myTank.setDir(Dir.UP);
            if (bR) myTank.setDir(Dir.RIGHT);
            if (bD) myTank.setDir(Dir.DOWN);
        }
    }
}
