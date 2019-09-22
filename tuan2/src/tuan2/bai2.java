package tuan2;


import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class bai2 extends JFrame{
    public bai2(){
        super("Demo Windows");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
            public static void main(String[] args) {
        bai2 JPanel= new bai2();
       JPanel.setSize(400,300);
       JPanel.setLocationRelativeTo(null);
       JPanel.setVisible(true);
       
       
      
       
       JPanel pnFlow = new JPanel();
       pnFlow.setLayout(new FlowLayout());
       pnFlow.setBackground(Color.red);
                JButton btn1=new JButton("FlowLayout");
                JButton btn2=new JButton("Add cac control");
                JButton btn3=new JButton("Tren 1 dong");
                JButton btn4=new JButton("Het cho chua");
                JButton btn5=new JButton("Thi xuong dong");
                pnFlow.add(btn1);
                pnFlow.add(btn2);
                pnFlow.add(btn3);
                pnFlow.add(btn4);
                pnFlow.add(btn5);
                JPanel.add(pnFlow);
                
       
    }       
    }