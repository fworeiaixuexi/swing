import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_background=new JLabel();
    JLabel label_plane=new JLabel();
    int cell=64;
    int row=0,column=0;

    //构造方法
    public App() {
        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == e.VK_UP) {
                    row--;
                    label_plane.setBounds(column*cell,row*cell,cell,cell);
                }
                if (e.getKeyCode() == e.VK_DOWN) {
                    row++;
                    label_plane.setBounds(column*cell,row*cell,cell,cell);
                }
                if (e.getKeyCode() == e.VK_LEFT) {
                    column--;
                    label_plane.setBounds(column*cell,row*cell,cell,cell);
                }
                if (e.getKeyCode() == e.VK_RIGHT) {
                    column++;
                    label_plane.setBounds(column*cell,row*cell,cell,cell);
                }
            }
        });

    }
    //显示窗体方法
    void go(){
        java.net.URL imgURL2 = App.class.getResource("plane4.png");
        label_plane.setIcon(new ImageIcon(imgURL2));
        label_plane.setBounds(0,0,cell,cell);
        myPanel.add(label_plane);


        java.net.URL imgURL1 = App.class.getResource("background.png");
        label_background.setIcon(new ImageIcon(imgURL1));
        label_background.setBounds(0,0,512,720);
        myPanel.add(label_background);

//
        myPanel.setLayout(null);
        JFrame frame = new JFrame("一个小程序");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0,0,512,720);
        //frame.pack();
        frame.setVisible(true);
        myPanel.setFocusable(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
