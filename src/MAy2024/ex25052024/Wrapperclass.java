package MAy2024.ex25052024;

public class Wrapperclass {
    public static void main(String[] args) {

    }
}
class Person{
    Integer rollno;
    String name;
    Long phonenumber;

    public Integer getRollno() {
        return rollno;
    }

    public void setRollno(Integer rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(Long phonenumber) {
        this.phonenumber = phonenumber;
    }

    public Person(Integer rollno, Long phonenumber, String name) {
        this.rollno = rollno;
        this.phonenumber = phonenumber;
        this.name = name;
    }
}
