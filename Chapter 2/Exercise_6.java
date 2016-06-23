/* Chapter 2, Exercise 6

(Sum the digits in an integer) Write a program that reads an integer 
between 0 and 1000 and adds all the digits in the integer. For example, 
if an integer is 932, the sum of all its digits is 14.
Hint: Use the % operator to extract digits, and use the / operator to 
remove the extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.

Here is a sample run:

Enter a number between 0 and 1000: 999
The sum of the digits is 27
*/


import java.util.Scanner;

public class Exercise_6 {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        // Prompt the user for input
        System.out.println("Enter a number between 0 and 1000: ");
        // Read the input
        int integer = input.nextInt();
        // Extract digits (count begins from right to left)
        int digit1 = integer % 10;
        int digit2 = (integer / 10) % 10;
        int digit3 = ((integer / 10) / 10) % 10;
        int digit4 = (((integer / 10) / 10 ) / 10) % 10;
        // Add all digits and display sum
        int sum = digit1 + digit2 + digit3 + digit4;
        System.out.println("The sum of the digits is " + sum);
    }
}