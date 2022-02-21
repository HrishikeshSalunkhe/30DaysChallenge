package secondDay.patternQuestions;
/**
 * @author Hrishikesh Salunkhe
 * Print the Zig-Zag Pattern
 *  e.g.
 *               *       *
 *             *   *   *   *
 *           *       *       *
 *
 */


public class ZigZag {
    public static void main(String[] args) {
        int row =3;
        int col =9;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <=col ; j++) {
                if((i+j)%4==0 || (i==2 && j%4==0)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
