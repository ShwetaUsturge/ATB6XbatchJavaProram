package MAy2024.Ex11052024;

public class Person {
    //Attributes
    String name;
    byte age;
    long phoneNumber;
    boolean ismale;
    String[] address;
    double height;
    float salary;
    String dob;
    String eyecolor;
    //behaviors/functionality
    void walk(){
        System.out.println("I can Walk");
    }
    void talk(String msg){
        System.out.println("I will say,"+msg);
    }
    String sleep(){
        return "Sleeping";
    }
    String eat(String item){
        return item;
    }

}
