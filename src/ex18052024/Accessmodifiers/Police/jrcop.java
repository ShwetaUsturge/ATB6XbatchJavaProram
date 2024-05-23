package ex18052024.Accessmodifiers.Police;

public class jrcop {
    public static void main(String[] args) {
        cop cop= new cop(10);
        System.out.println(cop.gun);
        cop.canIshoot();
    }
}
