package DSA.functionsAndMethods;

public class swapping {

    public static void swap(int a, int b ){
        int temp = a;
        a=b;
        b =temp;
        System.out.println("value of a is "+a + "value of b is"+b);
    }
    public static void main(String[] args) {

        //CALL BY VALUE
        swap(1,2);

    }
}
