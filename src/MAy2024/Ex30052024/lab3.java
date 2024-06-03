package MAy2024.Ex30052024;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class lab3 {
    public static void main(String[] args) {
//        List l1= null;
//        l1.add("add");
        List<Integer> marks= new ArrayList<>();
        marks.add(50);
        marks.add(78);
        marks.add(90);
        Collections.sort(marks);
        System.out.println(marks);
  }
}
