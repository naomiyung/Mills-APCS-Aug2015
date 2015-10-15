
/**
 * Exercise 2: EquestriaDiameter finds the diameter of a circular path and returns the length of the trip.
 * 
 * Naomi Yung 
 * 10/13/15 
 */
public class EquestriaDiameter
{
    public static void main(String[] args){
        double x= 35; //the approximate diameter of Equestria
        double length=roadTrip(x);
        System.out.println("The length of the trip is "+length);
    }
    public static double roadTrip(double diameter){
        double length=diameter*Math.PI;
        return length;
    }
}
