package MAy2024.Ex28052024;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.SequencedCollection;

public class lab6 {
    public static void main(String[] args) {
        ArrayList mylist1= new ArrayList();
        List mylist= new ArrayList();
        SequencedCollection mylist2= new ArrayList();
        Collection mylist3= new ArrayList();
        //Dynamic disapatch at peak
        mylist.add("Shweta");
        mylist.add("prashant");
        mylist.add("father");
        System.out.println(mylist);
        mylist.add("Shweta");
        mylist.add("prashant");
        mylist.add("father");
        System.out.println(mylist.size());
        mylist.add(null);
        mylist.add(null);
        System.out.println(mylist);


    }
}
