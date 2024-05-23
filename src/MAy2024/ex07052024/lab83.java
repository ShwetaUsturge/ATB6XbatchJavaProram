package MAy2024.ex07052024;

public class lab83 {
    public static void main(String[] args) {
        // return vs non return
        System.out.println("start of the program");
        int money = givemoneyfriend(100);
        System.out.println(money);
        givemoneytobeg();
        System.out.println("end of the progrAM");

    }
    static void givemoneytobeg(){
        System.out.println("blessing!!");
    }
    static int givemoneyfriend(int i){
        i = i-40;
        return i;
    }
}
