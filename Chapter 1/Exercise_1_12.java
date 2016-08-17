/*  (Average speed in kilometers) Assume a runner runs 24 miles in 1 hour, 
40 minutes, and 35 seconds. Write a program that displays the average speed 
in kilometers per hour. (Note that 1 mile is 1.6 kilometers.)  */

public class Exercise_1_12 {
    public static void main(String[] args) {
        // Initialize variables
        double hours = 1;
        double minutes = 40;
        double seconds = 35;
        double miles = 24;
        double km_equivalent = 1.6;

        // Convert time to only hours
        hours = hours + (minutes/60) + ((seconds/60)/60);
        // Convert miles to kilometers
        double kilometers = miles * km_equivalent;

        // Calculate average speed
        double speed = kilometers / hours;

        System.out.println(speed);
    }
}