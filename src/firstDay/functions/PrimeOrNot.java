package firstDay.functions;

public class PrimeOrNot {
    public static void main(String[] args) {
        int number =19;
        boolean flag= false;
        for (int i = 2; i <= Math.sqrt(number) ; i++) {
            if(number%i==0){
                System.out.println("Not a Prime Number");
                return;
            }
        }
        System.out.println("Prime Number");
    }
}
