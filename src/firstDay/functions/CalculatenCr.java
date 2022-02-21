package secondDay.functions;
/**
 * @author Hrishikesh Salunkhe
 *  Print the nCr
 *   Formula :->    n! / ((n-r)! * r!)
 */

public class CalculatenCr {
    static int factorial(int n) {
        int sum =1;
        for (int i = n; i >=1 ; i--) {
            sum = sum*i;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n=5;
        int r =2;
        System.out.println(factorial(n)/(factorial(n-r) * factorial(r)));
    }
}
