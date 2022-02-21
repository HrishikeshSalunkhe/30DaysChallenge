package firstDay.recursion;
/**
 * @author Hrishikesh Salunkhe
 * Print Numbers up to 10 starting from 1 using Recursion
 */
public class PrintNumber {
    public static void printNumber(int n){
        /**
         * Base Condition
         */
        if(n==11){
            System.out.println();
            return;
        }

        // Print Number
        System.out.print(n+" ");

        // Recursive Call
        printNumber(n+1);
    }
    public static void main(String[] args) {
        int n =1;
        System.out.println("<--------------->");
        printNumber(n);
        System.out.println("<--------------->");
    }
}
