package secondDay.functions;
/**
 * @author Hrishikesh Salunkhe
 *  Print the Fibonaci series till n
 */
public class Fibonacci {
    public static void fibonacci(int n){
        int firstTerm =0;
        int secondTerm =1;
        for (int i = 1; i <=n ; i++) {
            System.out.print(firstTerm+" ");
            int addition = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm =addition;

        }
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println("<----------------------->");
        fibonacci(n);
        System.out.println();
        System.out.println("<----------------------->");
    }
}
