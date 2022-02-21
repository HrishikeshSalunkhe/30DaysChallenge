package thirdDay.array;

/**
 * @author  Hrishikesh Salunkhe
 * Print the maximum element of the array
 */
public class MaximumElement {
    public static void main(String[] args) {
        int[] array = {9,8,74,6,2,63,23};
        int max=0;
        for (int i = 0; i < array.length ; i++) {
            if(max<array[i]){
                max = array[i];
            }
        }
        System.out.println("Maximum Element of Array: "+max);
    }
}
