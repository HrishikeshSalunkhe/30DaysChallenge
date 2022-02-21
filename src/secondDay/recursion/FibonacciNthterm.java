package firstDay.recursion;

/**
 * A Program to get Nth term in Fibonacci Series using recursion
 */
public class FibonacciNthterm {
    /**
     * A recursive function to return n'th number of fibonacci series
     * @param firstTerm
     * @param secondTerm
     * @param count to track the n`th number
     * @param n'th number which we have to return
     * @return
     */
    static int fibonacci(int firstTerm, int secondTerm, int n){
        if(n==1){
            return firstTerm;
        }
        return fibonacci(secondTerm,firstTerm+secondTerm,n-1);
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println("The "+n+" th term of fibonacci series " +
                "is: "+ fibonacci(0,1,n));
    }
}
