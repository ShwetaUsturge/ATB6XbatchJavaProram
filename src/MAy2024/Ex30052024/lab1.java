package MAy2024.Ex30052024;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.Callable;

public class lab1 {
    public static void main(String[] args) {
        List<String> CourseList = new ArrayList<>();
        CourseList.add("ATB");
        CourseList.add("MTB");
        CourseList.add("PyATB");
        CourseList.add("JAVA");
        CourseList.add("GitHub");
        //CourseList.add(563);
        List numList = new ArrayList();
        numList.add(150);
        numList.add(180);
        numList.add(150);
        numList.add(250);
        numList.add(345);
        CourseList.addAll(numList);
        System.out.println(CourseList);

        System.out.println("--------");
        Iterator iterator= CourseList.iterator();


        while (iterator.hasNext())
        {
            Object obj = iterator.next();
            if(obj instanceof String)
            {
                System.out.println(obj);
            }else
            {
                System.out.println("Not a Strig");
            }
        }
        for(String course: CourseList){
            System.out.println(course);
        }
        for(int i=0;i<CourseList.size();i++) System.out.println(CourseList.get(i));
    //List Itereator
        ListIterator lt= CourseList.listIterator();
        while (lt.hasNext()) {
           // lt.add("Shweta");
            System.out.println(lt.next());
        }

        ListIterator lt2= CourseList.listIterator(CourseList.size());
        while (lt2.hasPrevious()) {
           // CourseList.add("Shweta");
            // lt2.add("GenAi");
            System.out.println(lt2.hasPrevious());
        }


    }}