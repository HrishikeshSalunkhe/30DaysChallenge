package firstDay.recursion;
/**
 * @author Hrishikesh Salunkhe
 * Print the factorial of a number using Recursion
 */
public class Factorial {
    //basic FUnction
    static int factorial(int n, int product){

        //Base Condition
        if(n==1 || n==0){
            System.out.println("product = " + product);
            return product;
        }
        product *= n;

        // Recursive Call
        return factorial(n-1,product);
    }

    // Optimised Function
    static int factorial(int n){
        //Base Condition
        if(n==1 || n==0){
            return n;
        }
        // Recursive Call
        return factorial(n-1)*n;
    }
    public static void main(String[] args) {
        int n =10;
        System.out.println("Factorial of "+ n +" is= " + factorial(n,1));
        System.out.println("factorial() with optimised version = " + factorial(n));

    }
}
