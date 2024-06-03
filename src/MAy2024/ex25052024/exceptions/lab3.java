package MAy2024.ex25052024.exceptions;

public class lab3 {
    public static void main(String[] args) {
        try {
            //final keyword
            int a = 10;
            int b = 20 / 0;
       } catch (Exception e) {
           System.out.println("Exit");
        } finally {
            System.out.println("I am final");
        }
    }
}

