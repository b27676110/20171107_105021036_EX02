import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private JButton btn1 = new JButton("up");
    private JButton btn2 = new JButton("down");
    private JButton btn3 = new JButton("left");
    private JButton btn4 = new JButton("right");
    private JLabel lab1 = new JLabel("HA");
    private JPanel jpl1 = new JPanel();
    private JPanel jpl2 = new JPanel(new GridLayout(1,4,3,3));
    public MainFrame(){
        initcomp();
    }
    private void initcomp(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(100,100,800,800);
        lab1.setBounds(200,200,100,100);
        lab1.setBackground(new Color(255, 115, 0, 255));
        lab1.setOpaque(true);
        this.setLayout(null);
        this.add(lab1);
        Container cp;
        cp = getContentPane();
        cp.setLayout(new BorderLayout(10,10));
        cp.add(jpl1,BorderLayout.CENTER);
        cp.add(jpl2,BorderLayout.SOUTH);
        jpl2.add(btn1);
        jpl2.add(btn2);
        jpl2.add(btn3);
        jpl2.add(btn4);





    }
}
