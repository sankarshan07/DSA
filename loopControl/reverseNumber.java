package DSA.loopControl;

import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter the number to be reverse");
        int n  = sc.nextInt();  //rev =0
        while (n>0){
        int lastdigit = n %10;
            System.out.print(lastdigit);   //rev =(rev*10)+lastdigit  for palindrome
            n= n/10;

        }




    }
}
