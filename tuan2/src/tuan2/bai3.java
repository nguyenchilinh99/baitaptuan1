package tuan2;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class bai3 extends JFrame{
    public bai3(){
        super("Demo Windows");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
            public static void main(String[] args) {
        bai3 JPanel= new bai3();
       JPanel.setSize(400,300);
       JPanel.setLocationRelativeTo(null);
       JPanel.setVisible(true);
       
       
      
       JPanel pnBox =new JPanel();
       pnBox.setLayout(new BoxLayout(pnBox, BoxLayout.X_AXIS));
       JButton btn1 =new JButton("BoxLayout");
       btn1.setForeground(Color.red);
                Font font = new Font("Arial",Font.BOLD | Font.ITALIC,25);
                btn1.setFont(font);pnBox.add(btn1);
                JButton btn2=new JButton("X_AXIS");
                btn2.setForeground(Color.BLUE);
                btn2.setFont(font);pnBox.add(btn2);
                JButton btn3=new JButton("Y_AXIS");
                btn3.setForeground(Color.ORANGE);
                btn3.setFont(font);pnBox.add(btn3);
                
                JPanel.add(pnBox);
       
      
                
       
    }       
    }