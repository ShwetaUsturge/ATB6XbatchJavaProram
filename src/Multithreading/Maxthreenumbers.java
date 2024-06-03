package Multithreading;

public class Maxthreenumbers {
    public static void main(String[] args) {
        //max from three numbers
        int maxPut= maximumNumberOf(34,66,99);
        System.out.println(maxPut);
    }
    public static int maximumNumberOf(int a, int b, int c)
    {
        int max= a;
        if(b>max){
            max= b;
        }
        if(c>max){
            max=c;
        }return max;
    }
}
