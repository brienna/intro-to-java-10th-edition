/* Identify and fix the errors in the following code:

public class Test {
    public static void main(String[] args) {
        int i = j = k = 2;
        System.out.println(i + " " + j + " " + k);
    }
}
*/

public class Checkpoint_2_6 {
    public static void main(String[] args) {
        int i, j, k;  // must be declared before multiple variable assignment syntax
        i = j = k = 2;
        System.out.println(i + " " + j + " " + k);
    }
}