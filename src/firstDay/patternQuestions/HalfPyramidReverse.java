package firstDay.patternQuestions;
/**
 * @author Hrishikesh Salunkhe
 * Half Pyramid with 180 deg Rotation
 *
 */
public class HalfPyramidReverse {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
