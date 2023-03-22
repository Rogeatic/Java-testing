import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class main
{
    public static ArrayList total = new ArrayList<>();
    public static void main(String args[]) 
    {
        System.out.println("Hello to the world,");
        System.out.println("your name is " + getName() + " and your number is " + numberPower(5, 2));

        System.out.println("The different loops where: " + total);
    }
    public static String getName(){
        System.out.println("name: ");

        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        return name;
    }
    public static String numberPower(int num1, int pow){
        if(pow == 0) return "1";
        total.add(num1);

        String stringMaker = "";
        for (int i = 1; i < Math.abs(pow); i++){
            num1 *= num1; 
        }
        
        if (pow < 0) stringMaker = "1/" + num1;
        else stringMaker = "" + num1;
            
        
        return stringMaker;
    }


}