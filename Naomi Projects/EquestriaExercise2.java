
/**
 * EquestriaExercise2 finds the diameter of a circular path and returns the length of the trip.
 * 
 * Naomi Yung 
 * 10/13/15 
 */
public class EquestriaExercise2
{
    public static void main(String[] args){
        double x= 30; //the diameter of the circular path
        double length=roadTrip(x);
        System.out.println("The length of the trip is "+length);
    }
    public static double roadTrip(double diameter){
        double length=diameter*Math.PI;
        return length;
    }
}
