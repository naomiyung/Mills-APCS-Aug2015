
/**
 * FahrenheitConverter converts temperature in degrees Fahrenheit to Celsius.
 * Naomi Yung 
 * V1 9/8/15
 */
public class FahrenheitConverter
{
    public static void main(String[] args) {
        double fahrenheit, celsiusTemperature;
        fahrenheit = 0; //insert value you want converted here
        celsiusTemperature = (fahrenheit-32)*5/9;
        System.out.println("Temperature in Celsius:");
        System.out.println(celsiusTemperature + "°C");
    }
}
