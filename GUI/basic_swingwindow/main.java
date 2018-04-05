import javax.swing.*;



public class main{
    public static void main (String[] args){
        
        
        JFrame f = new BoringWindow();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(300,300);
        f.setVisible(true);


    }
}


class BoringWindow extends JFrame{};