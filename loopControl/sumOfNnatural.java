package DSA.loopControl;

import java.util.Scanner;

//sum of n natural numbers
public class sumOfNnatural {
    public static void main(String[] args) {
        Scanner  sc = new  Scanner(System.in);
        int sum = 0;
        int i = 0;
        int n = sc.nextInt();
        while (i<=n){
            sum =sum +i;

            i++;
        }
        System.out.println(sum);


    }
}
