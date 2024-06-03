package Multithreading;

public class maxthree {
    public static <Dt extends Comparable<Dt>> Dt maximumOf(Dt a, Dt b, Dt c){
        Dt max= a;
        if(b.compareTo(max)>0){
            max=b;
        }
        if (c.compareTo(max)>0)
        {
            max=c;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maximumOf(4,6,90));
        System.out.println(maximumOf(4.5,7.8,9.5));
        System.out.println(maximumOf('a','g','Z'));
    }
}
