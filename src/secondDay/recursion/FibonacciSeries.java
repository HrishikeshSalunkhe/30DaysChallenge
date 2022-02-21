package firstDay.recursion;
/**
 * @author Hrishikesh Salunkhe
 * Print the fibonacci Series till nth term using Recursion
 */
public class FibonacciSeries {

    static void fibonacciSeries(int firstTerm, int secondTerm, int n){
        if(n==0){
            System.out.println();
            return;
        }
        int number = firstTerm + secondTerm;
        System.out.print(number+" ");
        // Recursive Call
        fibonacciSeries(secondTerm,number,n-1);
    }


    //Other way of printing Fibonacci series
    static void fibonacciSeries2(int firstTerm, int secondTerm, int n){
        if(n==0)
            return;
        System.out.print(firstTerm+" ");
        fibonacciSeries2(secondTerm,firstTerm +secondTerm,n-1);
    }

    public static void main(String[] args) {
        int n=10;
        System.out.print(0 + " "+ 1+" ");
        fibonacciSeries(0,1,n-2);
        System.out.println("<---------------------->");
        fibonacciSeries2(0,1,n);
    }
}
