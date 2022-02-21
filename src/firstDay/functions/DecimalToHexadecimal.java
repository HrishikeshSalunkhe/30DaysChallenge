package secondDay.functions;

public class DecimalToHexadecimal {
    public static void main(String[] args) {
        int n = 100;
        decimalToHexadecimal(n);
    }

    private static void decimalToHexadecimal(int n) {
        String ans = "";
        char ch;
        while(n!=0){
            int rem = n%16;
            if(rem > 9 ){
                ch =(char) ('A' + rem -10);
                ans = ch + ans;
            }
            else{
                ans = rem + ans;
            }
            n = n/16;
        }
        System.out.println(ans);
    }
}
