package firstDay.functions;

public class DecimalToOctal {
    public static void main(String[] args) {
        int x =100;
        decimalToOctal(x);
    }

    private static void decimalToOctal(int n) {
        String ans = "";
        while(n!=0){
            int rem = n%8;
            ans = rem + ans;
            n = n/8;
        }
        System.out.println(ans);
    }
}
