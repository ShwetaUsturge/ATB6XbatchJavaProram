package MAy2024.Ex28052024;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class lab7 {
    public static void main(String[] args) {
        List mylist= new ArrayList();
        mylist.add("Shweta");
        mylist.add("prashant");
        mylist.add("father");
        mylist.add("father");
        System.out.println(mylist);
        Vector v= new Vector();
        v.add("Pratik");
        v.add("shree");
        v.add("owi");
        System.out.println(v);
        v.remove("owi");
        System.out.println(v);

        List l= new LinkedList();
        l.add("sdf");
        l.add("dsdv");
        l.add(134);
        l.add("gds");
        l.add("ds");
        System.out.println(l);

    }
}
