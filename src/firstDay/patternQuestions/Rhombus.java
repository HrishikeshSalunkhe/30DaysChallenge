package secondDay.patternQuestions;
/**
 * @author Hrishikesh Salunkhe
 * Print the Rhombus Pattern
 *  e.g.           * * * * *
 *               * * * * *
 *             * * * * *
 *           * * * * *
 *         * * * * *
 */
public class Rhombus {
    public static void main(String[] args) {
        int n =5;

        // Outer Loop
        for (int i = 1; i <=5 ; i++) {
            //Inner Loop for space
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }
            //Inner Loop for '*'
            for (int j = 1; j <= n ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
            
    }
}
