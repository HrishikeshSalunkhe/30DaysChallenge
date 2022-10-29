package fourthDay.array;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={11,22,33,44,55,66,77};
        int key = 5;
        System.out.println("Element is present at Index: " + binarySearch(arr, arr.length-1,key));

    }

    private static int binarySearch(int[] arr, int i, int key) {
        int startIndex =0;
        int lastIndex = i-1;
        while (startIndex<=lastIndex){
            int mid= (lastIndex +startIndex)/2;
            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid] > key){
                lastIndex = mid-1;
            }
            else {
                startIndex = mid+1;
            }
        }
        return -1;
    }
}
