package fourthDay.array;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {55,66,44,33,22,11};

        for (int i = 1; i < arr.length ; i++) {
            int key =arr[i];
            int j =i-1;
            while (j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j=j-1;
            }
            arr[j+1] = key;
            System.out.println("Elements for Iternation: "+i);
            for (int k = 0; k < arr.length ; k++) {
                System.out.print(arr[k]+ "  ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+ "  ");
        }

    }
}
