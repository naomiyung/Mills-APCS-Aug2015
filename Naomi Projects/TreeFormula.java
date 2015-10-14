
/**
 * TreeFormula allows you to plug in values to create trees.
 * 
 * Naomi Yung 
 * 9/28/15
 */
public class TreeFormula
{
    public static void main(String[] args) {
        treeFormula(3, 4); //3 is the number of layers on the tree; 4 is the amount of rows per layer
        treeStand(11); //11 is the number of character on the very bottom tier
        System.out.println();
        treeFormula(2,5);
        treeStand(13);
    }
        public static void treeFormula(int x, int y){
           for(int i=0; i<x; i++){
               for(int j=0; j<y; j++){
                   for(int k=1; k<=(y+1)-(1*i)-j; k++){
                       System.out.print(" ");}
                   for(int l=1; l<=(2*(j+1*i))+1; l++){
                       System.out.print("*");
                    }
               System.out.println();
            }
        }
    }
    public static void treeStand(int x){
        for(int i=0; i<(x-1)/2; i++){
        System.out.print(" ");
    }
        System.out.println("*"); 
        for(int i=0; i<(x-1)/2; i++){
        System.out.print(" ");
    }
        System.out.println("*");
    for(int i=0; i<(x-7)/2; i++){
        System.out.print(" ");
    }
        System.out.println("*******");
    
}
}
         




