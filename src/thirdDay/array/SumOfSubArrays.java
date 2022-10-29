package thirdDay.array;

/**
 * @author Hrishikesh Salunkhe
 * Print the sum of subarrays
 *
 */
public class SumOfSubArrays {
    public static void main(String[] args) {
        int[] array = {9,8,74,6,2,63,23};
        int sum ;

        //Outer loop
        for (int i = 0; i < array.length; i++) {
            sum=0;
            for (int j = i; j < array.length; j++) {
                sum +=array[j];
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}
