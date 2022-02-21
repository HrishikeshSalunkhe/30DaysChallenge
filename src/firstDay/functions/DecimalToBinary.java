package secondDay.functions;

public class DecimalToBinary {
    public static void main(String[] args) {
        int n =10;
        decimalToBinary(n);
    }

    private static void decimalToBinary(int n) {
       String ans = "";
        while(n!=0){
            int rem = n%2;
            ans = rem + ans;
            n = n/2;
        }
        System.out.println(ans);
    }
}
