
/**
 * ThreeStopTour finds the total distance between three destinations and the angles between each pair of cities.
 * 
 * Naomi Yung
 * 10/13/15
 */
public class ThreeStopTour
{
   public static void main(String[] args){
       double totalDistance=distance(30,13,35,9,22,7); //three pairs of coordinates for Baltimare, Manehattan, and Neighagra Falls
       distanceStatement("Baltimare", "Manehattan","Neighagra Falls",totalDistance);
    }
    public static double distance(int x1, int y1, int x2, int y2, int x3, int y3){
        double xdifference= Math.pow(x2-x1, 2);
        double ydifference=Math.pow(y2-y1, 2);
        double xdifference2=Math.pow(x3-x2,2);
        double ydifference2=Math.pow(y3-y2, 2);
        double betweenXandY=Math.sqrt(xdifference+ydifference);
        double betweenYandZ=Math.sqrt(xdifference2+ydifference2);
        double totalDistance=betweenXandY+betweenYandZ;
        return totalDistance;
    }
    public static void distanceStatement(String location1, String location2, String location3, double totalDistance){
        System.out.println("The total distance between "+location1+", "+location2+", and "+location3+" is "+totalDistance);
    }
}
