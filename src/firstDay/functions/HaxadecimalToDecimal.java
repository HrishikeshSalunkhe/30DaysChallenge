package firstDay.functions;

public class HaxadecimalToDecimal {
    public static void main(String[] args) {
        String str ="1cf";
        hexadecimalToDecimal (str);
    }

    private static void hexadecimalToDecimal(String str) {
        int ans = 0;
        int x =1;
        int size = str.length()-1;
        int i= size;
        while (i >= 0){
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                ans += x*(str.charAt(i)-'0');
            }
            else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'F'){
                ans += x*(str.charAt(i)-'A'+ 10);
            }
            else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'f'){
                ans+=x*(str.charAt(i)-'a'+10);
            }
            x *= 16;
            i--;
        }
        System.out.println(ans);
    }
}
