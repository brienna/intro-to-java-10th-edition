/* Chapter 2, Exercise 5

(Financial application: calculate tips) Write a program that reads the 
subtotal and the gratuity rate, then computes the gratuity and total. 
For example, if the user enters 10 for subtotal and 15% for gratuity rate, 
the program displays $1.5 as gratuity and $11.5 as total. Here is a sample run:

Enter the subtotal and a gratuity rate: 10 15
The gratuity is $1.5 and total is $11.5
*/


import java.util.Scanner;

public class Exercise_5 {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        // Prompt the user for input
        System.out.println("Enter the subtotal and a gratuity rate: ");
        // Read the input
        int subtotal = input.nextInt();
        double gratuityRate = input.nextInt();
        // Compute gratuity and total
        double gratuity = subtotal * (gratuityRate / 100);
        double total = subtotal + gratuity;
        // Display results
        System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
    }
}