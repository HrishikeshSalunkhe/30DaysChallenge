package fourthDay.twoDArray;

public class MatrixSearch {
    public static void main(String[] args) {
        int array[][] = {{1,2,3},{4,5,6,},{7,8,9}};

        int rowStart =0;
        int colStart = array[0].length-1;
        boolean flag =false;
        while(rowStart < array.length && colStart >= 0){
            int target = 9;
            if(array[rowStart][colStart] == target){
                flag = true;
                break;
            }
            else if (array[rowStart][colStart] < target){
                rowStart++;
            }
            else{
                colStart--;
            }
        }
        if(flag){
            System.out.println("Element Found");
        }
        else{
            System.out.println("Not Found");
        }
    }
}
