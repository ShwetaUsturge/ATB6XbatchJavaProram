package MAy2024.ex25052024.exceptions;

public class lab1 {
    public static void main(String[] args) {
        String sh= args[0];
        int x= Integer.parseInt(sh);
        int a= 10/x;
        System.out.println(x);
        System.out.println(a);
//unchecked exception
        int b=10;
        int d= b/0;
        System.out.println(d);
        //checked exception
        //FileInputStream f= new FileInputStream("c:/log.txt");
      //  File io-open
    }
}
