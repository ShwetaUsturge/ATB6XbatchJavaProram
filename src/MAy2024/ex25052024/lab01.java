package MAy2024.ex25052024;

public class lab01 {
    //wrapper class
    public static void main(String[] args) {
        int a=10;
        //String s1= a;
        //String s1= (String)a;
        String s1= String.valueOf(a);
        System.out.println(s1);
        Character ch='d';
       char a3= ch; //wrapper to premitive- unboxing

    Integer intobject= Integer.valueOf(5);
        System.out.println(intobject);
        Integer a2= 89;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.max(5,9));
        System.out.println(Integer.min(6,55));


    }
}
