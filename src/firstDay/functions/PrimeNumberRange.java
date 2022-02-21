package secondDay.functions;

/**
 * @author Hrishikesh Salunkhe
 *  Print the prime numbers in between two values
 */
public class PrimeNumberRange {
    public static boolean isPrime(int number){

        for (int i = 2; i <=Math.sqrt(number) ; i++) {
                if(number%i==0)
                    return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int  start = 10;
        int end = 30;
        System.out.println("<----------------------->");
        for (int i = start; i <= end ; i++) {
                if(isPrime(i)){
                    System.out.print(i + " ");
                }
        }
        System.out.println();
        System.out.println("<----------------------->");
    }
}
