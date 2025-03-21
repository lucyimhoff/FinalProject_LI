import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
public class TrashSort{
    private String[] brownBin = {"Fruit Peel", "Food Scraps", "Paper Towel", "Napkin", "Tea Bag" , "Flower"};
    private String[] blueBin = {"Can", "Bottle", "Jar", "Carton", "Aluminum Foil" , "Container"};
    private String[] blackBin;
    private String trash = "";

    public void ask(){
        System.out.println("What are you trying to sort:");
        Scanner s = new Scanner(System.in);
        trash = s.nextLine();

    }

    public String sort(){
        this.ask();
        for(int i = 0; i < brownBin.length; i++){
            if(brownBin[i].equals(trash)) return "Brown Bin"; }
        for(int i = 0; i < blueBin.length; i++){
                if(blueBin[i].equals(trash)) return "Blue Bin";

        }
        return "IDK";
    }

    
}