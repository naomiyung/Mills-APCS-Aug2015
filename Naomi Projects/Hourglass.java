
/**
 * Hourglass produces an image of an hourglass.
 * 
 * Naomi Yung
 * 9/18/15
 */
public class Hourglass
{
   public static void main(String[] args) {
       topBottomHourGlass();
       for(int i=1; i<=4; i++){
           for(int j=1; j<=i; j++){
               System.out.print(" ");
            }
        for(int k=1; k<=1; k++){
            System.out.print("\\");
        }
        for(int l=1; l<=10-(2*i); l++){
            System.out.print(":");
        }
        for(int m=1; m<=1; m++){
            System.out.print("/");
        }
        System.out.println();
    }
    System.out.println("     ||"); 
    for(int n=1; n<=4; n++){
        for(int o=1; o<=5-n; o++){
            System.out.print(" ");
        }
        for(int p=1; p<=1; p++){
            System.out.print("/");
        }
        for(int q=1; q<=2*n; q++){
            System.out.print(":");
        }
        for(int r=1; r<=1; r++){
            System.out.print("\\");
        }
        System.out.println();
    }
    topBottomHourGlass();
}
public static void topBottomHourGlass(){
    System.out.println("|\"\"\"\"\"\"\"\"\"\"|");
}
}
