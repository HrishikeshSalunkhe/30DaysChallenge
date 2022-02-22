package fourthDay.array;

/**
 * @author Hrishikesh Salunkhe
 * Check if there exists two elements in an array
 * such that their
 * sum is equal to given 'k'.
 */


public class PairSumProblem {
    public static void main(String[] args) {
        int array[] ={2,4,7,11,14,16,20,21};
        int k = 31;

        // Brute Force Approach
        System.out.println("<---------------->");
        System.out.println(pairSum(array, k));
        System.out.println("<---------------->");

        System.out.println();

        // Optimised Version (O(n))
        System.out.println("<---------------->");
        System.out.println(pairSumOptimised(array,k));
        System.out.println("<---------------->");


    }

    private static boolean pairSumOptimised(int[] array, int k) {
        int  low = 0;
        int high = array.length-1;
        while (low<high){
            if(array[low] + array[high] == k){
                return true;
            }
            else if(array[low] + array[high] > k){
                high--;
            }
            else if(array[low] + array[high] < k){
                low++;
            }
        }
        return  false;
    }




    //Brute Force Approach O(n^2)
    private static boolean pairSum(int[] array, int k) {
        for (int i = 0; i < array.length-1; i++) {
            for (int i1 = i+1; i1 < array.length; i1++) {
                if(array[i] + array[i1] == k){
                    return true;
                }
            }
        }
        return false;
    }
}
