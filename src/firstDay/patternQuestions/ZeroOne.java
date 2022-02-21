package secondDay.patternQuestions;
/**
 * @author Hrishikesh Salunkhe
 * Print the Zero-One Pattern
 *  e.g.  1
 *        0 1
 *        1 0 1
 *        0 1 0 1
 *        1 0 1 0 1
 */
public class ZeroOne {
    public static void main(String[] args) {
        int n =5;

        //Outer Loop
        for (int i = 1; i <=n ; i++) {
            //Inner Loop
            for (int j = 1; j <=i ; j++) {
                // For every Even position we print 1
                if((i+j)%2==0){
                    System.out.print(1 + " ");
                }
                // For every Odd position we print 0
                else{
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }   
    }
}
