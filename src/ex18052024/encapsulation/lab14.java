package ex18052024.encapsulation;

public class lab14 {
    public static void main(String[] args) {
        iciccbank I= new iciccbank("shweta",234421);
        System.out.println(I.getBalance());
        I.setBalance(-1);
        System.out.println(I.getBalance());
    }
}
