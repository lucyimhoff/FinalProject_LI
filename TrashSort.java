import java.util.ArrayList;
import java.util.Scanner;
public class TrashSort{
    private String[] brownBin = {"Fruit Peel", "Food Scraps", "Paper Towel", "Napkin", "Tea Bag" , "Flower"};
    private String[] blueBin = {"Can", "Bottle", "Jar", "Carton", "Aluminum Foil" , "Container"};
    private String[] blackBin = {"Plastic Bag", "Wrapper", "Dirty Napkin", "Styrofoam"};
    private String trash = "";
    private String bin;

    public void ask(){
        System.out.println("What are you trying to sort:");
        System.out.println("Please Select From This List:");
        for(String n : brownBin){
            System.out.print(n + " ");
        }
        System.out.println();
        for(String n : blueBin){
            System.out.print(n + " ");
        }
        System.out.println();
        for(String n : blackBin){
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.println();
        Scanner s = new Scanner(System.in);
        trash = s.nextLine();

    }

    

    public Bin sort(){
        this.ask();
        for(int i = 0; i < brownBin.length; i++){
            if(brownBin[i].equals(trash)){
                bin = "Brown";
                return new Bin("Brown");
            } }
        for(int i = 0; i < blueBin.length; i++){
                if(blueBin[i].equals(trash)) {
                    bin = "Blue";
                    return new Bin("Blue");
                }

        }
        for(int i = 0; i < blackBin.length; i++){
            if(blackBin[i].equals(trash)) {
                bin = "Black";
                return new Bin("Black");
            }

    }
        
        Questions n = new Questions();
        return(n.unknown());

    }
    public String getBin(){
        return bin;
    }

    
}