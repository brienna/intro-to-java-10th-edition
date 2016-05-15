/* Write a program that displays the following table:

a       a^2     a^3 
1       1       1   
2       4       8
3       9       27 
4       16      64
*/ 

public class Exercise_04 {
    public static void main(String[] args) {
        System.out.println("a\ta^2\ta^3");
        for(int row = 0; row <= 4; row++) {
            int squared = (int) Math.pow(row, 2);
            int cubed = (int) Math.pow(row, 3);
            System.out.println(row + "\t" + squared + "\t" + cubed);
        }
    }
}
