package secondDay.functions;
/**
 * @author Hrishikesh Salunkhe
 *  Print the sum of first n natual numbers
 */
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int n =10;
        System.out.println(sum(n));
    }

    private static int sum(int n) {
        int sum =0;
        for (int i = 1; i <=n; i++) {
            sum += i;
        }
        return sum;
    }
}
