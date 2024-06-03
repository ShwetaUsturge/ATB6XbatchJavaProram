package MAy2024.Ex28052024;
import java.util.List;

public class lab2 {
    public static void main(String[] args) {
        List shopping= List.of("Milk","butter","bread","cheese");
        System.out.println(shopping);
        System.out.println(shopping.size());

        List Fruits= List.of("Apple","Banana","Grapes","watermalon","Grapes");
        System.out.println(Fruits);
        System.out.println(Fruits.size());

        System.out.println(Fruits.get(0));
        System.out.println(Fruits.indexOf("Grapes"));
        System.out.println(Fruits.isEmpty());
        List my_10thMarks = List.of(90,88,100,98,69);
        System.out.println(my_10thMarks);
        System.out.println(my_10thMarks.size());

        List different_data_types= List.of("Shweta",278,"djsa");

    }
}
