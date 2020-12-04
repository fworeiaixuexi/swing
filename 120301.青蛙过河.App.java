import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_background=new JLabel();
    JLabel label_frog1=new JLabel();
    JLabel label_frog2=new JLabel();
    JLabel label_frog3=new JLabel();
    JLabel label_score=new JLabel();
    JTextArea textArea_UserInput=new JTextArea();
    JLabel label_end=new JLabel();
    int score=0,score1=0,score2=0,score3=0,score4=0,score5=0,score6=0,score7=0,score8=0,score9=0;
    // 第一片荷叶与第二片荷叶的位置
    int x1=350,y1=256,x2=250,y2=100;
    //构造方法
    public App() {
        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);

                textArea_UserInput.append(String.valueOf(e.getKeyChar()));
                //判断第一只青蛙是否在起点并且输入文本hello
                if ( label_frog1.getX()==200 && label_frog1.getY()==430 && textArea_UserInput.getText().equals("hello")){
                    score1=1;
                    label_frog1.setBounds(x1,y1,128,128);
                    label_score.setText("Your Score:"+String.valueOf(score=score1+score2+score3+score4+score5+score6+score7+score8+score9));
                    textArea_UserInput.setText("");
                }
                //判断第一只青蛙是否在第一片荷叶上；并判断输入的内容是否是world
                if ( label_frog1.getX()==x1 && label_frog1.getY()==y1 && textArea_UserInput.getText().equals("world")){
                    score2=1;
                    label_frog1.setBounds(x2,y2,128,128);
                    label_score.setText("Your Score:"+String.valueOf(score=score1+score2+score3+score4+score5+score6+score7+score8+score9));
                    textArea_UserInput.setText("");
                }
                //判断第一只青蛙是否在第二片荷叶上；并判断输入的内容是否是hi
                if ( label_frog1.getX()==x2 &&label_frog1.getY()==y2 && textArea_UserInput.getText().equals("hi")){
                    score3=1;
                    label_frog1.setBounds(900,10,128,128);
                    label_score.setText("Your Score:"+String.valueOf(score=score1+score2+score3+score4+score5+score6+score7+score8+score9));
                    textArea_UserInput.setText("");
                }
                 //第一只青蛙跳完
                // 判断第一只青蛙的位置是否在终点；第二只青蛙是否在起点；并判断输入的内容是否是hello，
                if ( label_frog1.getX()==900 && label_frog1.getY()==10 && label_frog2.getX()==100 && label_frog2.getY()==430 && textArea_UserInput.getText().equals("hello")){
                    score4=1;
                    label_frog2.setBounds(x1,y1,128,128);
                    label_score.setText("Your Score:"+String.valueOf(score=score1+score2+score3+score4+score5+score6+score7+score8+score9));
                    textArea_UserInput.setText("");
                }
                //判断第二只青蛙是否在第一片荷叶上；并判断输入的内容是否是world
                if ( label_frog2.getX()==x1 && label_frog2.getY()==y1 && textArea_UserInput.getText().equals("world")){
                    score5=1;
                    label_frog2.setBounds(x2,y2,128,128);
                    label_score.setText("Your Score:"+String.valueOf(score=score1+score2+score3+score4+score5+score6+score7+score8+score9));
                    textArea_UserInput.setText("");
                }
                //判断第二只青蛙是否在第二片荷叶上；并判断输入的内容是否是hi
                if ( label_frog2.getX()==x2 &&label_frog2.getY()==y2 && textArea_UserInput.getText().equals("hi")){
                    score6=1;
                    label_frog2.setBounds(800,10,128,128);
                    label_score.setText("Your Score:"+String.valueOf(score=score1+score2+score3+score4+score5+score6+score7+score8+score9));
                    textArea_UserInput.setText("");
                }
                //第二只青蛙跳完
                //第三只青蛙起跳
                if ( label_frog2.getX()==800 && label_frog2.getY()==10 && label_frog3.getX()==0 && label_frog3.getY()==430 && textArea_UserInput.getText().equals("hello")){
                    score7=1;
                    label_frog3.setBounds(x1,y1,128,128);
                    label_score.setText("Your Score:"+String.valueOf(score=score1+score2+score3+score4+score5+score6+score7+score8+score9));
                    textArea_UserInput.setText("");
                }
                if ( label_frog3.getX()==x1 && label_frog3.getY()==y1 && textArea_UserInput.getText().equals("world")){
                    score8=1;
                    label_frog3.setBounds(x2,y2,128,128);
                    label_score.setText("Your Score:"+String.valueOf(score=score1+score2+score3+score4+score5+score6+score7+score8+score9));
                    textArea_UserInput.setText("");
                }
                if ( label_frog3.getX()==x2 &&label_frog3.getY()==y2 && textArea_UserInput.getText().equals("hi")){
                    score9=1;
                    label_frog3.setBounds(700,10,128,128);
                    label_score.setText("Your Score:"+String.valueOf(score=score1+score2+score3+score4+score5+score6+score7+score8+score9));
                    textArea_UserInput.setText("");
                }
                //第三只青蛙跳完
                //全部青蛙跳完后弹出提示
                if (score == 9) {
                    label_end.setText("恭喜你完成游戏！");

                }

            }
        });

    }
    //显示窗体方法
    void go(){
        label_end.setBounds(200,100,200,200);
        label_end.setForeground(Color.red);
//        label_end.setFont(new Font("Arial",Font.PLAIN,30));

        //辅助标签
        textArea_UserInput.setText("");
        textArea_UserInput.setBounds(0,0,300,50);
        myPanel.add(textArea_UserInput);
        //隐藏辅助标签
        textArea_UserInput.setVisible(false);

        //背景图片
        java.net.URL imgURL = App.class.getResource("background.png");
        label_background.setIcon(new ImageIcon(imgURL));
        label_background.setBounds(0,0,1024,600);
        //三只青蛙
        java.net.URL imgURL2 = App.class.getResource("frog.png");
        label_frog3.setIcon(new ImageIcon(imgURL2));
        label_frog3.setBounds(0,430,128,128);

        java.net.URL imgURL3 = App.class.getResource("frog.png");
        label_frog2.setIcon(new ImageIcon(imgURL3));
        label_frog2.setBounds(100,430,128,128);

        java.net.URL imgURL4 = App.class.getResource("frog.png");
        label_frog1.setIcon(new ImageIcon(imgURL4));
        label_frog1.setBounds(200,430,128,128);


        label_score.setText("Your Score:0");
        label_score.setForeground(Color.blue);
        label_score.setFont(new Font("Arial",Font.PLAIN,30));
        label_score.setBounds(400,0,200,50);
        myPanel.add(label_end);
        myPanel.add(label_score);
        myPanel.add(label_frog1);
        myPanel.add(label_frog2);
        myPanel.add(label_frog3);
        myPanel.add(label_background);

        //
        JFrame frame = new JFrame("青蛙过河");
        myPanel.setLayout(null);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1024,600);
        //frame.pack();
        frame.setVisible(true);
        myPanel.setFocusable(true);//键盘监听必须加panel面板的焦点获取才可以
    }
    public static void main(String[] args) {
        new App().go();
    }
}
