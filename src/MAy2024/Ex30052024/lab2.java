package MAy2024.Ex30052024;

import java.util.*;

public class lab2 {
    public static void main(String[] args) {
        List CourseList= new LinkedList();
        CourseList.add("ATB");
        CourseList.add("MTB");
        CourseList.add("PyATB");
        CourseList.add("JAVA");
        CourseList.add("GitHub");
        System.out.println(CourseList);
        Vector<String> v1= new Vector<>();
        v1.add("ATB");
        v1.add("GIT");
        v1.add("GENAI");
        v1.add("PYATB");
        v1.add("JAVA");
        Enumeration e1= v1.elements();
        while (e1.hasMoreElements()){
            System.out.println(e1.nextElement());
        }
    }
}
