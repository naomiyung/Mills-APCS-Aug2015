
/**
 * BunchesOfTriangles is a strange drawing comprised of two triangles on either side of a rectangle 
   made up of two triangles.
 * 
 * Naomi Yung 
 * 9/21/15
 */
public class BunchesOfTriangles
{
   public static void main(String[] args) {
       for(int i=0; i<=6; i++){
           for(int j=0; j<=6-i; j++){
               System.out.print("*");
            }
            for(int k=0; k<=i; k++){
                System.out.print(" ");
            }
            for(int l=0; l<=12-2*i; l++){
                System.out.print("/");
            }
            for(int m=0; m<=2*i; m++){
                System.out.print("\\");
            }
            for(int n=0; n<=i; n++){
                System.out.print(" ");
            }
            for(int o=0; o<=6-i; o++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
