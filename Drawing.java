import java.awt.*;
import javax.swing.JFrame;
// canvas class from books.trinket.io

public class Drawing extends Canvas {
    private String bin;

    public void paint(Graphics g){
        //test1.getBin();
        g.setColor(Color.BLUE);
        g.fillRoundRect(100,100,200,300, 50, 50); //from trinket
    }
}