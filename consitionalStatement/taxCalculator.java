package DSA.consitionalStatement;

import java.util.Scanner;

public class taxCalculator {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int  income = sc.nextInt();
        if(income <=500000){
            System.out.println("tax = 0");
        } else if (income > 500000 && income <=1000000) {
            float tax =(income*(0.2f));
            System.out.println("tax = "+tax );
            
        }
        else if (income > 1000000){
            float tax =(income*(0.3f));
            System.out.println("tax = "+tax );
        }
        else {
            System.out.println("above 35%");
        }


    }
}
