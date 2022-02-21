package secondDay.functions;
/**
 * @author Hrishikesh Salunkhe
 *  Print the Factorial of n
 */
public class Factorial {
    public static void main(String[] args) {
        int n =5;
        System.out.println("s<----------------------->");
        System.out.println(factorial(n));
        System.out.println("<----------------------->");
    }

    private static int factorial(int n) {
        int sum =1;
        for (int i = n; i >=1 ; i--) {
            sum = sum*i;
        }
        return sum;
    }
}
