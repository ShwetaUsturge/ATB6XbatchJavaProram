package June2024.EX1062024;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class lab7 {
    public static void main(String[] args) {
        Map<String, Object> student= new HashMap();
        student.put("firstname","Shweta");
        student.put("age", 30);
        student.put("roll",3);
        student.put("email", "dasda@addad.omc");
        student.put("phone", "1234567890");
        student.put("city", "Pune");
        student.put("state", "MH");
        student.put("country", "India");
        student.put("zip", "411057");
        //System.out.println(student);

        Map<String, String> map2 = new HashMap();
        map2.put("firstName", "Amit");
        map2.put("lastName", "pawar");
        map2.put("email", "dasda@addad.omc");
        map2.put("phone", "1234567890");
        map2.put("city", "Pune");
        map2.put("state", "MH");
        map2.put("country", "India");
        map2.put("zip", "411057");

       // System.out.println(map2);

        ArrayList list = new ArrayList();
        list.add(student);
        list.add(map2);
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }
}
