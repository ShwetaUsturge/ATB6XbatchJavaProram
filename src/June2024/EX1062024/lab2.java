package June2024.EX1062024;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class lab2 {
    public static void main(String[] args) {
        TreeSet num= new TreeSet<>();
        num.add(67);
        num.add(654);
        num.add(32);
        num.add(89);
       // num.add(null);
        //num.add("Shweta");// java.lang.ClassCastException
        System.out.println(num);
        Set courseSets = new LinkedHashSet();
        courseSets.add("ATB");
        courseSets.add("MTB");
        courseSets.add("LAPIT");
        courseSets.add("SDET Blueprint");
        courseSets.add("Java for Testers");
        courseSets.add("Null");
        System.out.println(courseSets);

        Set courseSets1 = new HashSet();
        courseSets1.add("ATB");
        courseSets1.add("MTB");
        courseSets1.add("LAPIT");
        courseSets1.add("SDET Blueprint");
        courseSets1.add("Java for Testers");
        courseSets1.add("Null");
        System.out.println(courseSets1);

        Set integerSet3 = new TreeSet<>();
        integerSet3.add("Pramod");
        integerSet3.add("Dutta");
        integerSet3.add("Autta");
    }
}
