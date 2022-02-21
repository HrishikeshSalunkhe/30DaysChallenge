package thirdDay.array;

public class PrintSubArray {
    public static void main(String[] args) {
        int array[] = { -1,4,7,2};
        for (int i = 0; i < array.length ; ++i) {
            for (int j = i; j < array.length ; ++j) {
                for (int k = i; k <=j ; k++) {
                    System.out.print(array[k]+" ");
                }
                System.out.println();
            }
        }
    }
}
