package tuan2;

import javax.swing.JFrame;


public class Tuan2 extends JFrame {
    public Tuan2 (){
        super("Demo Windows");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
            public static void main(String[] args) {
       Tuan2 JPanel= new Tuan2();
       JPanel.setSize(400,300);
       JPanel.setLocationRelativeTo(null);
       JPanel.setVisible(true);
    }
    
}