package fourthDay.array;

public class BubbleSort {
    public static void main(String args[]){
        System.out.println("Bubble Sort");
        int arr[] = {66,55,44,33,22,11};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j] >= arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+ "  ");
        }
    }
}
