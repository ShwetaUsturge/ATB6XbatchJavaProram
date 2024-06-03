package MAy2024.Ex28052024;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class lab5 {
    public static void main(String[] args) {
        List mylist= new ArrayList();
        mylist.add("dskd");
        mylist.add("we");
        mylist.add("kd");
        mylist.add("daf");
        //mylist.add(true);
        System.out.println(mylist);
// for (String str : mylist){ System.out.println(str);}
        for (Object str : mylist){ System.out.println(str);}
        System.out.println("Print no1==");
        for(int i=0;i<mylist.size();i++) System.out.println(mylist.get(i));
        System.out.println("Print no 2==");
        System.out.println("Print no 3==");
        //iterator while loop
        Iterator<String> itr= mylist.iterator();
        while (itr.hasNext()) System.out.println(itr.next());

    }
}
