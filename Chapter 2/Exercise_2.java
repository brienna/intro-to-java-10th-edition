/* Chapter 2, Exercise 2

(Compute the volume of a cylinder) Write a program that reads in the radius 
and length of a cylinder and computes the area and volume using the following 
formulas:

area = radius * radius * PI
volume = area * length

Here is a sample run:

Enter the radius and length of a cylinder: 5.5 12
The area is 95.0331
The volume is 1140.4
*/


import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) {
        // Declare a constant
        final double PI = 3.14159;
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        // Prompt the user for input
        System.out.println("Enter the radius and length of a cylinder: ");
        // Read the double values
        double radius = input.nextDouble();
        double length = input.nextDouble();
        // Compute the area and volume of cylinder
        double area = radius * radius * PI;
        double volume = area* length;
        // Display area and volume
        System.out.println("area: " + area + ", volume: " + volume);
    }
}