package MAy2024.Ex28052024;

import java.util.ArrayList;
import java.util.List;

public class lab3 {
    public static void main(String[] args) {
        //List ArrayList= new ArrayList();
        ArrayList arrayList1= new ArrayList();
       //// List arrayList2= new ArrayList();
        //List mylist1= new List(); can not create object of interface list is interface
        List mylist= new ArrayList();
        mylist.add("sh1");
        mylist.add("pras");
        mylist.add("fsd");
        mylist.add("sh1");
        System.out.println(mylist);
        System.out.println(mylist.size());
        System.out.println(mylist.indexOf("sh1"));
        mylist.remove("sh1");
        System.out.println(mylist);
        mylist.clear();
        System.out.println(mylist);
        System.out.println(mylist.isEmpty());
        mylist.add("we");
        mylist.add("kd");
        mylist.add("daf");
        mylist.add(true);
        mylist.add(123);
        mylist.add("dd");
        mylist.set(1,"ghe");
        System.out.println(mylist);
        System.out.println("--------------");

        for (int i=0; i<mylist.size(); i++){
            System.out.println(mylist.get(i));
        }
        for (Object obj : mylist) System.out.println(obj);


    }}
