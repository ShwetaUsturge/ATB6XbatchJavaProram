package June2024.EX1062024;

import java.util.HashMap;
import java.util.Map;

public class lab4 {
    public static void main(String[] args) {
        //map - key value pair
        //api testing
        //json key value pair
        Map<String, Object> student= new HashMap();
        student.put("firstname","Shweta");
        student.put("age", 30);
        student.put("roll",3);
        student.put("jk",8);
        student.put("isMale", false);
        student.put("lastname","usturge");
        System.out.println(student);
        System.out.println(student.get("firstname"));
        System.out.println(student.get("age"));
        System.out.println(student.isEmpty());
        System.out.println(student.containsKey("age"));
        System.out.println(student.containsValue(65));
        System.out.println(student.keySet());
        System.out.println(student.values());
        for(Map.Entry<String,Object> item: student.entrySet()){
                System.out.println(item.getKey() + " : " + item.getValue());
        }
    }
}
