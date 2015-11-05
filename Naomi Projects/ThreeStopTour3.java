/**
 * Ex 3: ThreeStopTour3 finds the total distance between three destinations and the angles between each pair of cities.
 * 
 * Naomi Yung
 * 10/13/15
 */
public class ThreeStopTour3
{
   public static void main(String[] args){
       double totalDistance=distance(30,13,35,9,22,7); //three pairs of coordinates for Baltimare, Manehattan, and Neighagra Falls
       distanceStatement("Baltimare", "Manehattan","Neighagra Falls",totalDistance);
       double betweenXandY=betweenXandY(30,13,35,9);
       double betweenYandZ=betweenYandZ(35,9,22,7);
       double betweenZandX=betweenZandX(30,13,22,7);
       double angleBetween=angle(betweenXandY, betweenYandZ, betweenZandX);
       angleStatement("Baltimare", "Manehattan",angleBetween);
       angleBetween=angle(betweenYandZ,betweenZandX, betweenXandY);
       angleStatement("Neighagra Falls","Manehattan",angleBetween);
       angleBetween=angle(betweenZandX, betweenXandY, betweenYandZ);
       angleStatement("Baltimare", "Neighagra Falls", angleBetween);
    }
    //computes the length of each side of the "triangle" between the three cities
    public static double betweenXandY(int x1, int y1, int x2, int y2){
        double xdifference= Math.pow(x2-x1, 2);
        double ydifference=Math.pow(y2-y1, 2);
        double betweenXandY=Math.sqrt(xdifference+ydifference);
        return betweenXandY;
    }
    public static double betweenYandZ(int x2, int y2, int x3, int y3){
        double xdifference2=Math.pow(x3-x2,2);
        double ydifference2=Math.pow(y3-y2, 2);
        double betweenYandZ=Math.sqrt(xdifference2+ydifference2);
        return betweenYandZ;
    }
    public static double betweenZandX(int x1, int y1, int x3, int y3){
        double xdifference3=Math.pow(x1-x3, 2);
        double ydifference3=Math.pow(y1-y3,2);
        double betweenZandX=Math.sqrt(xdifference3+ydifference3);
        return betweenZandX;
    }

    //computes the total distance between the three cities (not counting the distance back to the first location from the third)
    public static double distance(int x1, int y1, int x2, int y2, int x3, int y3){
        double xdifference= Math.pow(x2-x1, 2);
        double ydifference=Math.pow(y2-y1, 2);
        double xdifference2=Math.pow(x3-x2,2);
        double ydifference2=Math.pow(y3-y2, 2);
        double xdifference3=Math.pow(x1-x3, 2);
        double ydifference3=Math.pow(y1-y3,2);
        double betweenXandY=Math.sqrt(xdifference+ydifference);
        double betweenYandZ=Math.sqrt(xdifference2+ydifference2);
        double betweenZandX=Math.sqrt(xdifference3+ydifference3);
        double totalDistance1=betweenXandY+betweenYandZ;
        double totalDistance=(int)(totalDistance1*100.0)/100.0;
        return totalDistance;
       
    }
    //states the total distance
    public static void distanceStatement(String location1, String location2, String location3, double totalDistance){
        System.out.println("The total distance between "+location1+", "+location2+", and "+location3+" is "+totalDistance);
    }
    //computes angle between 2 cities; for example, between Baltimare and Manehattan, you would be finding the angle of Neighagra
    public static double angle(double a, double b, double c){
        double angleEquation= (Math.pow(b,2)+Math.pow(c,2)-Math.pow(a,2))/(2*b*c);
        double angleinRadians=Math.acos(angleEquation);
        double angle1=(angleinRadians*180/Math.PI);
        double angle=(int)(angle1*100.0)/100.0;
        return angle;
    }
    //states the angles between two cities
    public static void angleStatement(String location1, String location2, double angleBetween){
        System.out.println("The angle between "+location1+" and "+location2+" is " +angleBetween+" degrees.");
    }
        
}