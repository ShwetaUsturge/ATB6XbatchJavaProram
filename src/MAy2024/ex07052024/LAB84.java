package MAy2024.ex07052024;

public class LAB84 {
    public static void main(String[] args) {
// functions
        System.out.println("start of the program");
        main(10);
        main("shweta", "shweta");
        main("a","shweta");
        System.out.println("End of the program");
    }
    static void god(){
// main function inside static void can be called
        main(new String[]{"12"});
    }
    // we cant create same main function with same name
   // public static void main(String[] args) {}
    // we can create main functions with defferent parameter
    static void main(int a){
        System.out.println("Print a" );
    }

     static String main(String a, String shweta) {
         System.out.println(a);
         return a;
     }
//main with different parameters
     static String main(String[] a,String b) {
         System.out.println(a);
         return "hello";

    }
}
