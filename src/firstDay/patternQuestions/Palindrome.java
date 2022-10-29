package firstDay.patternQuestions;
/**
 * @author Hrishikesh Salunkhe
 * Print the Palindrome Pattern
 *  e.g.
 *           1
 *         2 1 2
 *       3 2 1 2 3
 *     4 3 2 1 2 3 4
 *   5 4 3 2 1 2 3 4 5
 *
 */
public class Palindrome {
    public static void main(String[] args) {
        int n =5;

        //Outer Loop
        for (int i = 1; i <=n ; i++) {
            //Inner Loop FOr space
            for (int j = 1; j <=2*(n-i) ; j++) {
                System.out.print(" ");
            }
            //Inner Loop
            for (int j = i; j >=1 ; j--) {
                System.out.print(j+" ");
            }
            for (int j = 2; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

}
