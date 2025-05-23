import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;   //from trinket and Stack OverFlow


public class Main{
    public static void main(String[] args){
        TrashSort test1 = new TrashSort();
        System.out.println(test1.sort());
        JFrame frame = new JFrame("Background.png");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas = new Drawing();
        canvas.setSize(400,400);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true); //from trinket
    }


}