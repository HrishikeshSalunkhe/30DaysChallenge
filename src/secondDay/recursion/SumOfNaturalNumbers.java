package firstDay.recursion;

/**
 * @author Hrishikesh Salunkhe
 * Sum OF first n natural Numbers using Recursion
 */
public class SumOfNaturalNumbers {
    /**
     *
     * sumOfNaturalNumbers function to calculate the sum
     * @param n: Numbers up to sum needed to be printed
     * @param sum To store the sum of Natural Numbers
     * @return return the sum
     */
    static int sumOFNaturalNumbers(int n, int sum){
        if(n ==0){
            return sum;
        }
        sum += n;
        return sumOFNaturalNumbers(n-1, sum);
    }
    public static void main(String[] args) {
        int n =10;
        // Print the Sum of Natural Number

        System.out.println("n = " + sumOFNaturalNumbers(n,0));
    }
}
