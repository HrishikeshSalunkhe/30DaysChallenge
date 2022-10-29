package fourthDay.array;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {66,55,44,33,22,11};

        for (int i = 0; i < arr.length-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+ "  ");
        }

    }
}
