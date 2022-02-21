package secondDay.functions;

public class BinaryToDecimal {
    public static void main(String[] args) {
        int x =1010;
        binaryToDecimal(x);
    }

    private static void binaryToDecimal(int n) {
        int ans = 0;
        int x =1;
        while (n!=0){
            int y =n%10;
            ans += x*y;
            x=x*2;
            n =n/10;
        }
        System.out.println(ans);
    }
}
