
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
       double largestEven=-100000;
       double min=100000;
       double max=-100000;
       while (count<totalNumber){
           System.out.println("Print your number: ");
           double number=console.nextDouble();
           if(number%2==0){
               evenSum+=number;
            }
            if(number%2==0 && number>largestEven){
                largestEven=number;
            }
            if(number<min){
            min=number;
           }
           if(number>max){
               max=number;
            }
           count++;
        }
        System.out.println("The sum of all even numbers is "+evenSum);
        System.out.println("The largest number is "+max+" and the smallest number is "+min+".");
        System.out.println("The largest even number is "+largestEven+".");
        
}
}
