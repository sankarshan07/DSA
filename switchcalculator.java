package DSA;

import java.util.Scanner;

public class switchcalculator {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int a = sc.nextInt();;
        int b = sc.nextInt();;

        System.out.println("enter your choice");
        int ch = sc.nextInt();
        switch (ch){
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a*b);
                break;
            case 3:
                System.out.println(b/a);
                break;
            default:
                System.out.println("");
        }

    }
}
