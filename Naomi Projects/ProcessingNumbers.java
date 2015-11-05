
/**
 * ProcessingNumbers accepts a string of numbers, prints the smallest and largest numbers, and prints the
 * sum of all the even numbers along with the largest even number typed.
 * 
 * Naomi Yung
 * 11/4/15
 */
import java.util.*;
public class ProcessingNumbers
{
   public static void main(String[] args){
       Scanner console=new Scanner(System.in);
       System.out.println("How many numbers do you want to input?");
       int totalNumber=console.nextInt();
       int count=0;
       int evenSum=0;
       while (count<totalNumber){
           System.out.println("Print your number: ");
           double number=console.nextDouble();
           if(number%2==0){
               evenSum+=number;
            }
           count++;
        }
        System.out.println("The sum of all even numbers is "+evenSum);
        double max=0;
        if(number<10000){
            max=number;
        }
           
}
}
