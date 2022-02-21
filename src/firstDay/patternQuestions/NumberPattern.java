package secondDay.patternQuestions;
/**
 * @author Hrishikesh Salunkhe
 * Print the Number Pattern
 *  e.g.
 *               1
 *              1 2
 *             1 2 3
 *            1 2 3 4
 *           1 2 3 4 5
 *
 */
public class NumberPattern {
    public static void main(String[] args) {
        int n=5;
        //Outer Loop
        for (int i = 1; i <=n ; i++) {
            //Inner Loop for space
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }
            //Inner Loop
            for (int j = 1; j <= i ; j++) {
                    System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
