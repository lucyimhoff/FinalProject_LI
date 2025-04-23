import java.util.Scanner;
public class Questions{
    private String result = "";
    public String unknown(){
        System.out.println("What material is your item made of? 1. Plastic 2. Paper 3. Food");
        Scanner s = new Scanner(System.in);
        result = s.nextLine();
        if(result.equals("1")){
            System.out.println("Is it hard or soft plastic?");
            result = s.nextLine();
            if(result.equals("hard")){
                return "Blue Bin";
            }
            if(result.equals("soft")){
                return "LandFill";
            }}
        if(result.equals("2")){
            System.out.println("Is the food soiled or dirty? 1. Yes 2. No");
            result = s.nextLine();
            if(result == "2"){
                return("Paper Bin or Brown Bin");
            }
            if(result.equals("1")){
                return("Brown Bin");
            }

        }
        if(result.equals("3")){
            return("Brown Bin");
        }
        return "Landfill";
    }
}