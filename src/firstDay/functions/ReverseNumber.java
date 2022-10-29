package firstDay.functions;

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 1034;
        int reverseNumber=0;
        while(number>0){
            int lastDigit = number%10;
            reverseNumber = reverseNumber*10 + lastDigit;
            number/=10;
        }
        System.out.println(reverseNumber);
    }
}
