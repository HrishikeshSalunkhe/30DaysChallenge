package secondDay.patternQuestions;
/**
 * @author Hrishikesh Salunkhe
 * Print the Diamond Pattern
 *  e.g.           *
 *               * * *
 *             * * * * *
 *           * * * * * * *
 *           * * * * * * *
 *             * * * * *
 *               * * *
 *                 *
 */
public class Diamond {
    public static void main(String[] args) {
        int n =5;
        //Outer loop first Half
        for (int i = 1; i <=n ; i++) {
            //Inner Loop
            for (int j = 1; j <=2*(n-i) ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i -1; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        //Outer Loop for second Half
        for (int i = 5; i >=1 ; i--) {
            //Inner Loop
            for (int j = 1; j <=2*(n-i) ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i -1; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
