package firstDay.recursion;
/**
 * @author Hrishikesh Salunkhe
 * Print the Power of a number using Recursion
 */
public class PowerOf {
    // O(n) - Complexity
    static  int powerOf(int x, int powerN){
        //Base Condition
        if( powerN==0 || x==1){
            return 1;
        }

        //Recursive Call
        return powerOf( x , powerN-1)*x;
    }

    //Optimised Code
    // O(log n) - Complexity
    static int power(int x , int n){
        //Base Condition
        if( n == 0 || x==1){
            return 1;
        }

        if(n%2==0){
            return power(x,n/2) * power(x,n/2);
        }
        else{
            return  x*power(x,n/2) * power(x,n/2);
        }
    }

    public static void main(String[] args) {
        int x =10;
        int powerN = 2;
        System.out.println(powerOf(x,powerN));

        System.out.println("<---------------------->");
        System.out.println("Optimised function call:\t"+power(x,powerN));

    }
}
