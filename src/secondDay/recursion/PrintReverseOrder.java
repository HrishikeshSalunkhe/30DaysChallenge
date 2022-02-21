package firstDay.recursion;
/**
 * @author Hrishikesh Salunkhe
 * Print Numbers up to 1 starting from 10 using Recursion
 */

public class PrintReverseOrder {
    public static void printReverseOrder(int num){
        /**
         * Base Condition
         */
        if(num==0){
            System.out.println();
            return;
        }
        System.out.print(num+" ");

        //Recursive Call
        printReverseOrder(num-1);
    }
    public static void main(String[] args) {
        int num = 10;
        System.out.println("<--------------->");
        printReverseOrder(num);
        System.out.println("<--------------->");

    }
}
