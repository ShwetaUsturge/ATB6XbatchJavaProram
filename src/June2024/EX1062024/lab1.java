package June2024.EX1062024;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class lab1 {
    public static void main(String[] args) {
        Set course = new HashSet();
        course.add("ATB");
        course.add("AMT");
        course.add("PTB");
        course.add("JAVA");
        course.add("GItB");
        System.out.println(course);
        System.out.println("''''''''''''");
for (Object o: course){
    System.out.println(o);
    System.out.println("''''''''''''");
}
        Iterator it= course.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
