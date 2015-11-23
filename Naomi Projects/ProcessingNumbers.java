/**
 * ProcessingNumbers accepts a string of numbers, prints the smallest and largest numbers, and prints the
 * sum of all the even numbers along with the largest even number typed.
 * 
 * Naomi Yung
 * 11/5/15
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
       double largestEven=-1000000;
       double min=1000000;
       double max=-1000000;
       while (count<totalNumber){ //asks the user to input a # however many times the user said
           System.out.println("Print your number: ");
           double number=console.nextDouble();
           //if a number is even/divisible by two it is added to the overall sum of evens, or evenSum
           if(number%2==0){
               evenSum+=number;
            }
            //if a number is even and is more than the largestEven, then it replaces the largestEven as
            //the largest even until a larger even comes along to replace it 
            if(number%2==0 && number>largestEven){
                largestEven=number;
            }
            //if a number is less than the min, then min's value is replaced by number's until replaced
            if(number<min){
            min=number;
           }
           //if a number is more than the max, then max's value is replaced by number's until replaced
           if(number>max){
               max=number;
            }
            //increment the count so that the while loop will repeat until it hits totalNumber
           count++;
        }
        System.out.println("The sum of all even numbers is "+evenSum);
        System.out.println("The largest number is "+max+" and the smallest number is "+min+".");
        System.out.println("The largest even number is "+largestEven+".");
        
}
}
