//question of arithmetic exception using try catch blocks.


/*int 10/0 
 * (can't divide by 0 exception)
 */

public class arithmeticException {

    public static void main(String[] args) {
        try {
            int d = 10 / 1;  // Division by zero
            System.out.println("d: " + d);  // This will not be executed
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
    }
}
