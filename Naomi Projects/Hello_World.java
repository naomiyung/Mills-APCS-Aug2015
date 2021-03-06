
/**
 * Hello_World program.
 * 
 * Naomi Yung 
 * 8/22/15 V1
 */
public class Hello_World
{
    public static void main (String[] args)
    {
        System.out.println("Hello World! From Naomi day 2"); //Display the string
    } 
}


import java.util.*;
public class FracCalc {
     public static void main(String[] args){
        Scanner console=new Scanner(System.in);
        System.out.println("Write an equation for fractions (type quit to exit):");
        String equation=console.nextLine();
        if(equation.equals("quit")){
           System.out.println();
        }else{
           String secondOp=produceAnswer(equation);
           System.out.println(secondOp);
           System.out.println("Write an equation for fractions (type quit to exit):");
           equation=console.nextLine();
       }
    }
    public static String produceAnswer(String equation){
        String parseSecond=parseSecondOperand(equation);
        System.out.println(parseSecond);
        String secondOp=secondOperator(equation);
        return secondOp;
    }
    public static String secondOperator(String equation){ //finds the second operand
        int equationLength=equation.length();
        int firstSpace=equation.indexOf(" ");
        String secondOp=equation.substring(firstSpace+3);
        return secondOp;
    }
   public static String parseSecondOperand(String secondOp){ //separates and parses the second operand
        String wholeNumber="";
        String numerator="";
        String denominator="";
        int indexUnderscore=secondOp.indexOf("_");
        int indexDivision=secondOp.indexOf("/");
        if(indexUnderscore!=-1){
            wholeNumber=secondOp.substring(0,indexUnderscore);
        }
        if(indexUnderscore==-1 && indexDivision==-1){
            wholeNumber=secondOp.substring(0);
        }

       if(indexDivision!=-1){
        numerator=secondOp.substring(indexUnderscore+1,indexDivision);
        denominator=secondOp.substring(indexDivision+1);
        }else{
        numerator="0";
        denominator="1";
       }
       String parsedFraction="whole:"+wholeNumber+" numerator:"+numerator+" denominator:"+denominator;
       return parsedFraction;
    }
    
    }