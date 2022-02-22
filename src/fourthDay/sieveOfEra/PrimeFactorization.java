package fourthDay.sieveOfEra;

public class PrimeFactorization {
    public static void main(String[] args) {
        int n =50;
        sievePrimeFactor(n);
    }

    private static void sievePrimeFactor(int n) {
        int factor[] = new int[n+1];
        for (int i = 0; i < factor.length; i++) {
            factor[i] = i;
        }
        for (int i =2; i*i<=n;i++){
            if(factor[i] == i){
                for (int j = i*i; j <=n ; j+=i) {
                    if(factor[j] == j){
                        factor[j] = i;
                    }
                }
            }
        }
        while(n!=1){
            System.out.print(factor[n]+" ");
            n = n /factor[n];
        }

    }
}
