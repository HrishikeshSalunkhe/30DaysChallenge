package secondDay.functions;
/**
 * @author Hrishikesh Salunkhe
 * Check if given numbers are pythagoras triplets or, not?
 */
public class PythagorasTriplets {
    public static void main(String[] args) {
        int x =8;
        int y =6;
        int z= 1;
        System.out.println(pythogorasTriplet(x,y,z));
    }

    private static boolean pythogorasTriplet(int x, int y, int z) {
        z = Math.max(x,Math.max(y,z));

        return Math.pow(z,2) == (Math.pow(x,2) + Math.pow(y,2)) ? true: false;
    }
}
