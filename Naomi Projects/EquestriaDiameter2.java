
/**
 * Exercise 2: EquestriaDiameter2 finds the diameter of a circular path and returns the length of the trip.
 * 
 * Naomi Yung 
 * 10/13/15 
 */
public class EquestriaDiameter2
{
    public static void main(String[] args){
        double x= 35; //the approximate diameter of Equestria
        double length=roadTrip(x);
        System.out.println("The length of the trip is "+length);
    }
    //equation for circumference of a circle
    public static double roadTrip(double diameter){
        double length1=diameter*Math.PI;
        double length=(int)(length1*100.0)/100.0;
        return length;
    }
}
