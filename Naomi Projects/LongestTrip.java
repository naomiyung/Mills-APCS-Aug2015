
/**
 * Exercise 4: LongestTrip returns the longest distance between any pair of destinations.
 * 
 * Naomi Yung
 * 10/14/15
 */
public class LongestTrip
{
    public static void main(String[] args){
        double longestDistance= distanceBetween(30,13,35,9,22,7);
        System.out.println("The longest trip is "+longestDistance);
    }

    public static double distanceBetween(int x1, int y1, int x2, int y2, int x3, int y3){
        double xdifference= Math.pow(x2-x1, 2);
        double ydifference=Math.pow(y2-y1, 2);
        double xdifference2=Math.pow(x3-x2,2);
        double ydifference2=Math.pow(y3-y2, 2);
        double xdifference3=Math.pow(x1-x3, 2);
        double ydifference3=Math.pow(y1-y3,2);
        double betweenXandY=Math.sqrt(xdifference+ydifference);
        double betweenYandZ=Math.sqrt(xdifference2+ydifference2);
        double betweenZandX=Math.sqrt(xdifference3+ydifference3);
        double almostLongestDistance= Math.max(betweenXandY, betweenYandZ);
        double longestDistance=Math.max(almostLongestDistance, betweenZandX);
        return longestDistance;
    }
}


