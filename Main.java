import javax.imageio.ImageIO;
public class Main{
    public static void main(String arg[]){
        TrashSort test1 = new TrashSort();
        System.out.println(test1.sort());
        Image img = ImageIO.read(new File("Background.png"));
    }
}