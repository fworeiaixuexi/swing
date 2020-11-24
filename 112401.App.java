import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    JTextArea textArea_A=new JTextArea();
    JTextArea textArea_B=new JTextArea();
    //构造方法
    public App() {
        textArea_A.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);

                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    if (textArea_A.getText().equals("test")) {
                        textArea_B.append("输入正确！");

                }
                    if (!textArea_A.getText().equals("test")) {
                        textArea_B.append("输入错误！");
                    }
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    textArea_B.setText("");
                }


//                if (e.getKeyCode() == KeyEvent.VK_UP) {
//                    textArea_B.append("恭喜你获得屠龙宝刀+1！\n");
//                }
//                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
//                    textArea_B.setText("");
//                }
            }
        });

    }
    //显示窗体方法
    void go(){
        myPanel.add(textArea_A);
        textArea_A.setText("请输入test");
        textArea_A.setBounds(100,100,300,150);
        textArea_A.setBackground(Color.pink);
        myPanel.add(textArea_B);
        textArea_B.setBounds(100,300,300,150);
        textArea_B.setBackground(Color.cyan);
//以下为模板
        JFrame frame = new JFrame("TestGUI");
        myPanel.setLayout(null);
        myPanel.add(label_txt);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,720);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
