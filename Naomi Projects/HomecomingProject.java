/**
 * HomecomingProject will help you get a date and calculate the costs of the dance.
 * 
 * Naomi Yung
 * 10/23/15
 */
import java.util.*;
public class HomecomingProject
{
    public static void main(String[] args){
        String myName="Vickie"; //name of whoever is going with the user
        Scanner console=new Scanner(System.in);
        String theirName=getADate(myName, console);
        System.out.println();
        System.out.println("Let's figure out the damage for the evening:");
        damage();
        System.out.println();
        statsTable(myName, theirName);
        
    }

   public static String getADate(String name, Scanner console){
        Scanner userInput=new Scanner(System.in);
        String myName=name;
        System.out.println("My name is "+myName+".");
        System.out.println("What's your name?");
        String theirName=console.nextLine();
        System.out.println("Nice to meet you "+theirName+".");
        System.out.println("Would you like to go to Homecoming with me?");
        System.out.println("Great! It'll be a magical night--"+myName+" and "+theirName);
        System.out.println(" going to the Mills Homecoming Dance 2015!");
        return theirName;
       
    }

    //figures out the costs between you and your date depending on who is paying
    public static void damage(){
        double allCosts=costMethod(" (each)", 2, 1);
        System.out.println("So, you should expect to spend, including tax: $"+allCosts);
        double splitCosts=allCosts/2;
        double allSplitCosts=(int)(splitCosts*100.0)/(100.0);
        System.out.println("If you split the costs with your date, each will pay: $"+allSplitCosts);
    }
    
    //the table for input that the user provides for how much each thing costs
    public static double costMethod(String each, int theNumber, int number2){
        Scanner userInput=new Scanner(System.in);
        System.out.print("Tickets "+each+": ");
        double ticketCost=userInput.nextDouble()*theNumber;
        System.out.print("Flowers: ");
        double flowerCost=userInput.nextDouble();
        System.out.print("Pictures: ");
        double pictureCost=userInput.nextDouble();
        System.out.print("Dinner "+each+": ");
        double dinnerCost=userInput.nextDouble()*theNumber;
        System.out.print("New clothes: ");
        double clothCost=userInput.nextDouble();
        double foodClothes= (int)(foodandClothes(dinnerCost, clothCost)*100.0)/(100.0);
        System.out.print("Other costs: ");
        double otherCosts=userInput.nextDouble();
        double someCosts=ticketCost+dinnerCost+flowerCost+pictureCost+clothCost+otherCosts;
        double costs=someCosts+foodClothes;
        double allCosts=(int)(costs*100.0)/(100.0);
        
        for(int i=number2; i<=0; i++){
        System.out.println("         Subtotal   "+someCosts);
        System.out.println("        Sales tax   "+foodClothes);
        System.out.println("            Total   "+allCosts);
    }
        return allCosts;
    }
   
    //compiles the tax for FOOD AND CLOTHING ONLY
    public static double foodandClothes(double dinner, double clothes){
        double taxedFood=dinner*0.0825;
        double clothesCost=clothes*0.0825;
        double together=taxedFood+clothesCost;
        return together;
    }
    
  
    public static void statsTable(String name, String otherName){
        System.out.println("MHS Homecoming 2015");
        System.out.println(name+" and "+otherName);
        double total=costMethod(" (total)", 1,0);

}
}
        


