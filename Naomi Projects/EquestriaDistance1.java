
/**
 * Exercise 1: EquestriaDistance1 returns the distance between 2 locations from the map of Equestria.
 * 
 * Naomi Yung
 * 10/13/15
 */
public class EquestriaDistance1
{
    public static void main(String[] args){
        double distanceBetween= distance(30,13,35,9);
        distanceFrom("Baltimare", "Manehattan", distanceBetween);
        distanceBetween= distance(6,19,22,7);
        distanceFrom("Los Pegasus", "Neighagra Falls", distanceBetween);
        distanceBetween= distance(23,25,16,14);
        distanceFrom("Badlands", "Ponyville", distanceBetween);
    }
    public static void distanceFrom(String location1, String location2, double distanceBetween){
        System.out.println("Distance from "+location1+" to "+location2+" = "+distanceBetween);
    }
    //finds the distance between two locations using the formula
    public static double distance(int x1, int y1, int x2, int y2){
        int xdifference= (x2-x1);
        int ydifference= (y2-y1);
        double distanceBetween1= Math.sqrt(Math.pow(xdifference, 2) + Math.pow(ydifference,2));
        double distanceBetween=(int)(distanceBetween1*100.0)/100.0;
        return distanceBetween;
    }
}


