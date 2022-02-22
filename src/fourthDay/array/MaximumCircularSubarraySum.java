package fourthDay.array;

import javax.sound.midi.Soundbank;

public class MaximumCircularSubarraySum {
    public static void main(String[] args) {
        int array[] ={4,-4,6,-6,10,-11,12} ;
        int sum =0;

        System.out.println("Sum Of SubArray = Total Sum of array  - Sum Of Non-Contributing Elements: ");
        System.out.println("<--------------------------------------------------------------------------->");
        int nonWrapSum =kadaneAlgo(array);
        for (int i = 0; i < array.length ; i++) {
            sum += array[i];
            array[i] = -array[i];
        }
        System.out.println("Total Sum is: " + sum);
        /**
         * sum of subarray=  sum - (-kadane(array));
         * i.e. sum of subarrays = sum + kadane(array)
         *
         */

        int wrapSum = sum + kadaneAlgo(array);
        System.out.println("Sum Of Non-Contributing Elements:" + wrapSum);
        System.out.println(Math.max(nonWrapSum,wrapSum));

    }

    private static int kadaneAlgo(int[] array) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            currentSum += array[i];
            if(currentSum<0){
                currentSum=0;
            }
            maxSum = Math.max(currentSum,maxSum);
        }

        return maxSum;
    }
}
