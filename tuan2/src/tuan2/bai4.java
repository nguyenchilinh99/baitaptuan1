package tuan2;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;

public class bai4 extends JFrame{
    public bai4 (){
        super("Demo Windows");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
            public static void main(String[] args) {
        bai4 JPanel= new bai4();
       JPanel.setSize(400,300);
       JPanel.setLocationRelativeTo(null);
       JPanel.setVisible(true);
       JPanel pnBorder=new JPanel();
       pnBorder.setLayout(new BorderLayout());
       JPanel pnNorth =new JPanel();
       pnNorth.setBackground(Color.red);
       pnBorder.add(pnNorth,BorderLayout.NORTH);
       JPanel pnSouth=new JPanel();
       pnSouth.setBackground(Color.red);
       pnBorder.add(pnSouth,BorderLayout.SOUTH);
       JPanel pnWest=new JPanel();
       pnWest.setBackground(Color.BLUE);
       pnBorder.add(pnWest,BorderLayout.WEST);
       JPanel pnEast =new JPanel();
       pnEast.setBackground(Color.BLUE);
       pnBorder.add(pnEast,BorderLayout.EAST);
       JPanel pnCenter =new  JPanel();
       pnCenter.setBackground(Color.yellow);
       pnBorder.add(pnCenter,BorderLayout.CENTER);
       
       JPanel.add(pnBorder);
    
}
}