import java.util.Scanner;
public class Questions{
    private String result = "";
    private String bin;
    public String unknown(){
        System.out.println("What material is your item made of? 1. Plastic 2. Paper 3. Food");
        Scanner s = new Scanner(System.in);
        result = s.nextLine();
        if(result.equals("1")){
            System.out.println("Is it hard or soft plastic?");
            result = s.nextLine();
            if(result.equals("hard")){
                bin = "Blue";
                return "Blue Bin";
            }
            if(result.equals("soft")){
                bin = "Black";
                return "LandFill";
            }}
        if(result.equals("2")){
            System.out.println("Is the food soiled or dirty? 1. Yes 2. No");
            result = s.nextLine();
            if(result == "2"){
                bin = "Brown";
                return("Paper bin or Brown Bin");
            }
            if(result.equals("1")){
                bin = "Brown";
                return("Brown Bin");
            }

        }
        if(result.equals("3")){
            bin = "Brown";
            return("Brown Bin");
        }
        bin = "Black";
        return "Landfill";
    }
    public String getBin(){
        return bin;
    }
}