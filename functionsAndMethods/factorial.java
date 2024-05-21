package DSA.functionsAndMethods;

import java.util.Scanner;

public class factorial {
    public static int fact(int n){
        int f =1;
        for (int i=1; i<=n; i++){
            f= f*i;
        }
        return f;

    }
    public static float combination(int n ,int r){
        int nfact =fact(n);
        int rfact =fact(r);
        int nrfact =fact(n-r);
        float comb = nfact/(rfact*nrfact);
        return comb;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(combination(m,n));
//        int b = fact(m);
//        System.out.println(b);
    }
}
