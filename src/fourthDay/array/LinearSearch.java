package fourthDay.array;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int key =1;
        boolean flag =false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==key){
                flag = true;
                System.out.println("Element is present at Index: "+i);
            }
        }
        if(!flag){
            System.out.println("Element is not present: -1");
        }

    }
}
