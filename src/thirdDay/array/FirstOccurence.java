package thirdDay.array;
/**
 * @author Hrishikesh Salunkhe
 * A program to find the first ocurrence index of element which occured more than once
 * e.g. 1 5 3 4 3 5 6
 * 5 and 3 are occured more than once
 * But 5 is at index 2 and 3 is at index 3 (considering indexing starts from 1)
 * So answer is 2
 */
public class FirstOccurence {
    public static void main(String[] args) {
        int array[] ={1,5,3,4,3,5,6};
        int size = array.length;
        int arraySize = 1000000;
        int indexArray[] = new int[arraySize];
        for (int i = 0; i < indexArray.length; ++i) {
            indexArray[i] = -1;
        }
        int minIndex = Integer.MAX_VALUE;
        for (int i = 0; i <size ; i++) {
            if(indexArray[array[i]] != -1){
                minIndex = Math.min(minIndex,indexArray[array[i]]);
            }
            else{
                indexArray[array[i]]=i;
            }
        }
        if(minIndex == Integer.MAX_VALUE){
            System.out.println("Not Present");
        }
        else{
            System.out.println(minIndex+1);
        }
    }
}
