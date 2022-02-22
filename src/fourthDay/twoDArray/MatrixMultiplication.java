package fourthDay.twoDArray;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int rows1 = 3;
        int col1 = 4;
        int rows2 = 4;
        int col2 =3;
        int matrix[][] = {{2,4,1,2},{8,4,3,6},{1,7,9,5}};
        int matrix2[][] ={{1,2,3},{4,5,6},{7,8,9},{4,5,6}};
        int result[][] ={{0,0,0},{0,0,0},{0,0,0}} ;

        for (int i = 0; i < rows1 ; i++) {
            for (int j = 0; j < col2 ; j++) {
                for (int k = 0; k < col1 ; k++) {
                    result[i][j] += matrix[i][k] * matrix2[k][j];
                }
            }
        }
        // ANswer
        for (int i = 0; i < rows1 ; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.print(result[i][j]+ "\t");
            }
            System.out.println();
        }
    }
}
