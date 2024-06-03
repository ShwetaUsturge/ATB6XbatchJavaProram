package June2024.EX1062024;

import java.util.Enumeration;
import java.util.Hashtable;

public class lab8 {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht1= new Hashtable<>();
        ht1.put(1,"one");
        ht1.put(2,"two");
        ht1.put(4,"four");
        Enumeration<Integer> e= ht1.keys();
        while (e.hasMoreElements()){
            Integer key= e.nextElement();
            System.out.println(key + ":" + ht1.get(key));
            }

        }
    }

