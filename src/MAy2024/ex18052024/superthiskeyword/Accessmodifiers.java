package MAy2024.ex18052024.superthiskeyword;

class Accessmodifiers1 {
    public static void main(String[] args) {

    }
    class P{
        void m1(){
            System.out.println("M1");
        }
        void m2(){
            m1();
            System.out.println("M2");
        }
    }
}
