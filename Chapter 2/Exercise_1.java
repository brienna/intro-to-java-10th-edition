/* Chapter 2, Exercise 1

Convert Celsius to Fahrenheit) Write a program that reads a 
Celsius degree in a double value from the console, then converts 
it to Fahrenheit and displays the result. The formula for the 
conversion is as follows:

fahrenheit = (9 / 5) * celsius + 32

Hint: In Java, 9 / 5 is 1, but 9.0 / 5 is 1.8. Here is a sample run:

Enter a degree in Celsius: 43 
43 Celsius is 109.4 Fahrenheit
*/


// Import Scanner
import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        // Prompt the user for input
        System.out.println("Enter a degree in Celsius: ");
        // Read a double value
        double celsius = input.nextDouble();
        // Convert to Fahrenheit
        double fahrenheit = (9.0 / 5) * celsius + 32;
        // Display the result
        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
    }
}