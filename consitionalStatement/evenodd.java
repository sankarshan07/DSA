package DSA.consitionalStatement;

import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt();
        if (a%2 == 0){
            System.out.println("the number is even");

        }
        else {
            System.out.println("the number is odd ");
        }
    }
}
