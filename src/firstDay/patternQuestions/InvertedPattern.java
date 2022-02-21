package secondDay.patternQuestions;
/**
 * @author Hrishikesh Salunkhe
 * Print the Inverted Pattern
 *  e.g.  1 2 3 4 5
 *        1 2 3 4  
 *        1 2 3
 *        1 2
 *        1
 */
public class InvertedPattern {
    public static void main(String[] args) {
        int  n =5;
        //Outer Loop
        for (int i = 5; i >=1 ; --i) {
            //Inner loop
            for (int j = 1; j <=i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
