package fourthDay.sieveOfEra;

public class Sieve {

    public static void main(String[] args) {
        int n =50;
        sieve(n);
    }

    private static void sieve(int n) {
        boolean bool[] = new boolean[n+1];
        for (int i = 0; i < bool.length; i++) {
            bool[i] = false;
        }
        for (int i =2; i*i<=n;i++){
            if(bool[i] == false){
                for (int j = i*i; j <=n ; j+=i) {
                    bool[j] =true;
                }
            }
        }
        for (int i = 2; i <=n ; i++) {
            if(bool[i] == false){
                System.out.print(i + " ");
            }
        }
    }
}
