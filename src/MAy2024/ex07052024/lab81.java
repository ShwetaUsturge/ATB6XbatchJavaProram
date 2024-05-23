package MAy2024.ex07052024;

public class lab81 {
    public static void main(String[] args) {
        int a;
        int r1 = sumOftwonumbers(5,8);
        System.out.println(r1);
        int r2 = sumOftwonumbers(10,20);
        System.out.println(r2);
        String r3= sumOftwonumbers("shweta", 78);
        System.out.println(r3);
    }
    static int sumOftwonumbers(int a, int b){
        return a+b;
    }
    //function with the same name but different parameters
    static String sumOftwonumbers(String a, int b){
        System.out.println(",,,");
        return a+b;
    }
}
