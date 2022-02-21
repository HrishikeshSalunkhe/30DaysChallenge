package thirdDay.array;

public class SmallestPositiveMissingNumber {
    public static void main(String[] args) {
        int array[] ={0, -9,1,3,-4,5};
        int size = array.length;
        boolean boolValues[] = new boolean[100_000];
        for (int i = 0; i < boolValues.length; ++i) {
            boolValues[i] = false;
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i]>=0){
                boolValues[array[i]] =true;
            }
        }
        for (int i = 1; i < boolValues.length ; i++) {
                if(boolValues[i] == false){
                    System.out.println("Missing Number is: "+ i);
                    break;
                }
        }

    }
}
