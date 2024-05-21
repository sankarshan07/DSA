package DSA.functionsAndMethods;

import java.util.Scanner;

public class produc {
    public static void product(int a , int b){
        System.out.println("the product of a and b is "+a*b);
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
int m = sc.nextInt();
int n = sc.nextInt();
product(m,n);

    }
}
