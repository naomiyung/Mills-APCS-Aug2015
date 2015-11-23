import java.util.*;
public class FracCalc {
     public static void main(String[] args){
        Scanner console=new Scanner(System.in);
        System.out.println("Write an equation for fractions (type quit to exit):");
        String equation=console.nextLine();
        if(equation.equals("quit")){
           System.out.println();
        }else{
           produceAnswer(equation);
           System.out.println("Write an equation for fractions (type quit to exit):");
           equation=console.nextLine();
       }
    }

    public static String produceAnswer(String equation){
        String secondOp=secondOperator(equation);
        System.out.println(secondOp);
        String partsofSecond=parseSecondOperand(secondOp);
        System.out.println(partsofSecond);
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
        }else{
            wholeNumber="0";
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
}