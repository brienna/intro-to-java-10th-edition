/* Chapter 1, Exercise 13:

(Algebra: solve 2 x 2 linear equations) You can use Cramer's rule to 
solve the following 2 x 2 system of linear equations:

ax + by = e
cx + dy = f

x = (ed - bf) / (ad - bc)
y = (af - ec) / (ad - bc)

Write a program that solves the following equation and displays the value
for x and y: 

3.4x + 50.2y = 44.5
2.1x + .55y = 5.9 
*/ 

public class Exercise_13 { 
    public static void main(String[] args) {
        // Assign Cramer's variables
        double a = 3.4;
        double b = 50.2;
        double c = 2.1;
        double d = .55;
        double e = 44.5;
        double f = 5.9;

        // Solve the system
        double x = (e * d - b * f) / (a * d - b * c);
        double y = (a * f - e * c) / (a * d - b * c);

        // Display the value for x and y
        System.out.println("x = " + x + ", y = " + y);
        // x = 2.623901496861419, y = 0.7087397392563978
    }
}

