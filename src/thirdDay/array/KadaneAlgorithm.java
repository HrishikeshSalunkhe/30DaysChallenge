package thirdDay.array;

public class KadaneAlgorithm {
    public static void main(String[] args) {
        int[] a = {1,-4,3,2,-1,1 ,7,-1};
        int currentSum = 0;
        int max= 0;
        for (int i = 0; i < a.length; i++) {
            currentSum += a[i];
            if(currentSum < 0){
                currentSum = 0;
            }
            max= Math.max(max,currentSum);
        }
        System.out.println(max);
    }

}
