
/**
 * AsciiSea is ASCII art of an underwater scene.
 * 
 * Naomi Yung
 * 10/2/15
 */
public class AsciiSea {
   public static void main(String[] args){
       rowofBirds(4); //number of birds printed
       waves(22); //number of waves 
       System.out.println();
       System.out.println();
       System.out.print("\t\t");
       schoolofFish(3); //number of fish
       System.out.println();
       System.out.print("\t");
       schoolofFish(7);
       System.out.println();
       schoolofFish(5);
       System.out.println();
       squid();
       seaweed(2, 5); //how many pairs of seaweed and plants; the second number is the height
   }
   public static void rowofBirds(int x){
      
        for(int i=0; i<x; i++){
            System.out.print("   /\\  /\\\t");
        }
        System.out.println();
        for(int j=0; j<x; j++){
            System.out.print("  /  \\/  \\\t");
        }
        System.out.println();
   }

   public static void waves(int x){
        for(int i=0; i<=x; i++){
            System.out.print("~~~");
        }
   }
   
   public static void schoolofFish(int x){
        for(int i=0; i<x; i++){
            System.out.print("><(((°>\t");
        }
        System.out.println();
   }
   public static void squid(){
        System.out.println("\t\t\t     _________");
        System.out.println("\t\t\t    /         \\");
        System.out.println("\t\t\t   /   .   .   \\");
        System.out.println("\t\t\t  /     ---     \\");
        System.out.println("\t\t\t (               )");
        System.out.println("\t\t\t  \\             /");
        System.out.println("\t\t\t  )) ((  )) ((  )) ");
        System.out.println("\t\t\t ((   ))((   ))((");
        System.out.println("\t\t\t  )) ((  )) ((  ))");
        
   }
   public static void seaweed(int number, int height){
        for(int j=0; j<=number; j++){
            System.out.print(" (  )\t            \t");
    }
    System.out.println();
    for(int k=0; k<=number; k++){      
        System.out.print(" /  \\\t     ||     \t");
    }
    System.out.println();
    for(int n=0; n<=height; n++){
        for(int i=0; i<=number; i++){
        System.out.print("( || )\t<)))>||<(((>\t");
    }
    System.out.println();
    for(int i=0; i<=number; i++) {
        System.out.print(" )||(\t     ||     \t");
    }
    System.out.println();
}
        System.out.println();
}
   
}






