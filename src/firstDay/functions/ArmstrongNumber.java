package firstDay.functions;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int number = 151;
        int temp=number;
        int sumOfDigit =0;
        while(number>0){
            int lastDigit = number%10;
            sumOfDigit += Math.pow(lastDigit,3);
            number/=10;
        }
        if(temp == sumOfDigit){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not a Armstrong Number");
        }
    }
}
