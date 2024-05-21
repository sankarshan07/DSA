package DSA.functionsAndMethods;

import java.util.Scanner;

public class demofun {
    public static  void printHW(){  //static function
        System.out.println("hwllo world");
    }
  static void sumoftwo(int a,int b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
//        printHW();   //function call
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        sumoftwo(a,b);



    }
}

