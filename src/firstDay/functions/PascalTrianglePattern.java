package firstDay.functions;
/**
 * @author Hrishikesh Salunkhe
 * Print the Pascal Triangle Pattern
 *  What is Pascal Triangle:    https://en.wikipedia.org/wiki/Pascal%27s_triangle              *
 */

public class  PascalTrianglePattern {
    private static int factorial(int n) {
        int sum =1;
        for (int i = n; i >=1 ; i--) {
            sum = sum*i;
        }
        return sum;
    }
    private static int pascalTriangle(int n, int r){
        return factorial(n)/(factorial(n-r) * factorial(r));
    }
    public static void main(String[] args) {
            int n= 5;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <= (n-i) ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i ; j++) {
                System.out.print(pascalTriangle(i,j)+" ");
            }
            System.out.println();
        }
    }
}
