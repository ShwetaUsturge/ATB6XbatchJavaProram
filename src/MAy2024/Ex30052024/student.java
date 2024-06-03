package MAy2024.Ex30052024;

import java.util.Comparator;

class SortByidAsc implements Comparator<student>{
    @Override
    public int compare(student o1, student o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }
}
class SortByidDesc implements Comparator<student>{
    @Override
    public int compare(student o1, student o2) {
        return Integer.compare(o2.getId(), o1.getId());
    }
}
class SortByname implements Comparator<student>{
    @Override
    public int compare(student o1, student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
class SortBynameDesc implements Comparator<student>{
    @Override
    public int compare(student o1, student o2) {
        return (o2.getName().compareTo(o1.getName()) );
    }
}
public class student implements Comparable<student> {
    public student (Integer id, String name){
        this.id=id;
        this.name=name;
    }
    Integer id;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

public String toString(){
        return "Student{"+ "id=" + id+ ", name= " +name+ '\'' +'}';
}
//public int compareTo (student o){
//        return Integer.compare(this.id, o.id);
//}

    @Override
    public int compareTo(student o) {
        return CharSequence.compare(this.name, o.name);
    }
}

