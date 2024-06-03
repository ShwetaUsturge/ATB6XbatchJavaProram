package MAy2024.ex25052024.exceptions;

public class lab2 {
    public static void main(String[] args) {
    try{
        String s1= "Shweta";
        String a1= args[0];
        int a= 10/0;
        s1= null;
        System.out.println(s1.trim());
    }catch (NullPointerException |ArithmeticException |ArrayIndexOutOfBoundsException e){
        System.out.println("s1 is Null");
    }catch (Exception e)
    {
        System.out.println("s1 is NUll");
    }
    catch (Throwable e){
        System.out.println("problem");
    }
}}
