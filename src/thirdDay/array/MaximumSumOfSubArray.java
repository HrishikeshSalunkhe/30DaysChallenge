package thirdDay.array;

public class MaximumSumOfSubArray {
    public static void main(String[] args) {
        int[] array = {1,-4,3,2,1};
        int sum=0;
        int max =0;

        //Outer loop
        for (int i = 0; i < array.length; ++i) {
            sum=0;
            for (int j = i; j < array.length; ++j) {
                sum +=array[j];
                //System.out.println(sum);
                if(max < sum){
                    max = sum;
                }
            }
        }
        System.out.println(max);
    }
}
