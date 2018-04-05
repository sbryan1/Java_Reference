/*
    
    
    
java.
    
    
    
    
    java.awt --- abstract window toolkit

        - java.awt.Graphics --- "Graphics g" instance \\no need for "new Graphics", JVM does this automatically





    javax.swing.JPanel

        - extends: JComponent

    
        - paintComponent(Graphics g) ---  method where all painting code should be placed
        - drawString(String str, int x, int y)
*/



import javax.swing.*;
import java.awt.*;

public class main{

    public static void main(String[] args){

        myFrame f1 = new myFrame();
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
        f1.setVisible(true);

    }

}



class myFrame extends JFrame{ //javax.swing.JFrame
    
    public myFrame(){
        setTitle("Frame Title"); // setTitle(String title) --- sets title for frame
        setSize(300,200); //  setSize(int width, int height) --- resizes frame
        setLocation(100,200); // setLocation(int x, int y) --- moves franme to a new location



    myPanel p1 = new myPanel();
    Container c1 = getContentPane();
    c1.add(p1);

    }
}

class myPanel extends JPanel{ //javax.swing.JPanel -- extends JComponent
    public void paintComponent(Graphics g){ // 'g' is the "Graphics" object to protect
        super.paintComponent(g); //we want the JPanel to be drawn the usual Java way first
        g.drawString("Hi",75,100);
    }

}