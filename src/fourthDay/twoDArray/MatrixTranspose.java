package fourthDay.twoDArray;

public class MatrixTranspose {
    public static void main(String[] args) {
        int array[][] = {{1,2,3},{4,5,6,},{7,8,9}};

        // Before Transpose
        for (int i = 0; i < array.length; i++) {
            for (int i1 = 0; i1 < array.length; i1++) {
                System.out.print(array[i][i1]+" ");
            }
            System.out.println();
        }

        System.out.println("<--------->");
        for (int i = 0; i < array.length ; i++) {
            // For upper half
            for (int j = i; j < array[i].length ; j++) {
                int temp = array[i][j];
                array[i][j] = array [j][i];
                array [j][i] = temp;
            }
        }

        //After Transpose
        for (int i = 0; i < array.length; i++) {
            for (int i1 = 0; i1 < array.length; i1++) {
                System.out.print(array[i][i1]+" ");
            }
            System.out.println();
        }
    }
}
