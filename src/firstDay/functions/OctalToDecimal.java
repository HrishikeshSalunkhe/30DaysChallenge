package firstDay.functions;

public class OctalToDecimal {
    public static void main(String[] args) {
        int x= 17;
        octalToDecimal(x);
    }

    private static void octalToDecimal(int n) {
        int ans = 0;
        int x =1;
        while (n!=0){
            int y =n%10;
            ans += x*y;
            x=x*8;
            n =n/10;
        }
        System.out.println(ans);
    }
}
