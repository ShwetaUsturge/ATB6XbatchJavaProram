package MAy2024.ex25052024.exceptions;

public class trycatch {
    public static void main(String[] args) {
        //try and catch
        try {
            String sh = args[0];
            int x = Integer.parseInt(sh);
            int a = 10 / x;
            System.out.println(x);
            System.out.println(a);
        } catch (ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Problem with the code");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Can you enter input");
        }}
}