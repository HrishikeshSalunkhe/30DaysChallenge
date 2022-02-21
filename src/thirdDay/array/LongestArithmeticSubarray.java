package thirdDay.array;
/**
 * @author Hrishikesh Salunkhe
 * Print the Length Of Longest Arithmetic Subarray
 */
import java.util.Scanner;

public class LongestArithmeticSubarray {
    public static void main(String[] args) {
        long array[] ={9,8,7,8,6,4,2,0,1,5,3,7,2};
        int n = array.length;
        long previousDifference = array[1]-array[0];
        int curr =2;
        long ans = 2;
        for (int i = 2; i <n ; ++i) {
            long previousDifference1 = array[i] - array[i - 1];
            if(previousDifference == previousDifference1){
                curr++;
            }
            else{
                previousDifference = previousDifference1;
                // Because difference is taken in between two numbers
                // that's why curr = 2
                curr =2;
            }
            ans = Math.max(ans,curr);

        }
        System.out.println(ans);

    }
}
