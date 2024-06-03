package MAy2024.Ex30052024;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class lab6 {
    public static void main(String[] args) {
    student s1= new student(1,"Shweta");
    student s2= new student(5,"Prashant");
    student s3= new student(2,"ghew");
        List<student> students= new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        System.out.println(students);
        Collections.sort(students, new SortByidAsc());
        System.out.println(students);
        Collections.sort(students, new SortByidDesc());
        System.out.println(students);
        Collections.sort(students, new SortByname());
        System.out.println(students);
        Collections.sort(students, new SortBynameDesc());
        System.out.println(students);
    }
}
