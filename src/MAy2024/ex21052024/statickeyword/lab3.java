package MAy2024.ex21052024.statickeyword;

public class lab3 {
    public static void main(String[] args) {
        A a = new A();
        A b = new A();
        A c= null;
        System.out.println(A.common);
        System.out.println(a.common);
        System.out.println(b.common);
        //System.out.println(A.age);
        A.m1();
        a.m1();
        b.m1();
       // A.m2(); non static functions can not be called without reference
        a.m2();
        b.m2();
        c.m1();
       // c.m2(); instance cant be accessed


    }}
    class A {
    int age=10;
    static String common="Abd";
        static {
            System.out.println("A");
        }
        {
            System.out.println("IIB");
        }
        static void m1(){
            System.out.println("Static function m1");
        }
        void m2(){
            System.out.println("m2");
        }
    }



