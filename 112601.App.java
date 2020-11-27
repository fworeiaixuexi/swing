import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_background=new JLabel();
    JLabel label_score=new JLabel();
    JLabel label_end=new JLabel();
    int score,score1,score2,score3;

    //构造方法
    public App() {
        label_background.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (e.getX()>673&&e.getX()<717 && e.getY()>300&&e.getY()<329) {
                    score1=1;
                    score=score1+score2+score3;
                    label_score.setText("Your score:"+String.valueOf(score));

                }
                if (e.getX()>595&&e.getX()<616 && e.getY()>545&&e.getY()<555) {
                    score2=1;
                    score=score1+score2+score3;
                    label_score.setText("Your score:"+String.valueOf(score));

                }
                if (e.getX()>850&&e.getX()<904 && e.getY()>215&&e.getY()<235) {
                    score3=1;
                    score=score1+score2+score3;
                    label_score.setText("Your score:"+String.valueOf(score));

                }
                if (score == 3) {
                    label_end.setText("Game Over");
                }
            }
        });

    }
    //显示窗体方法
    void go(){
        myPanel.add(label_end);
        label_end.setBounds(450,0,200,200);
        label_end.setForeground(Color.red);
        label_end.setFont(new Font("Arial",Font.PLAIN,30));
//背景与成绩的显示
        myPanel.add(label_score);
        label_score.setText("Your score:0");
        label_score.setFont(new Font("Arial",Font.PLAIN,24));
        label_score.setBounds(50,0,200,200);
        java.net.URL imgURL = App.class.getResource("background2.jpg");
        label_background.setIcon(new ImageIcon(imgURL));
        label_background.setBounds(0,0,1000,800);
        myPanel.add(label_background);

        //模板
        JFrame frame = new JFrame("森林找茬游戏");
        myPanel.setLayout(null);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1000,800);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
