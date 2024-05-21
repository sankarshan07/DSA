package DSA.functionsAndMethods;

public class binaryToDecimal {
    public  static void binToDec(int binNum){
        int pow =0;
        int denum =0;
        while(binNum>0){
            int ld = binNum%10;
            denum =denum+(ld*(int) Math.pow(2,pow));
            pow++;
            binNum=binNum/10;
        }
        System.out.println(denum);
    }
    public static void main(String[] args) {
binToDec(101);
    }
}
