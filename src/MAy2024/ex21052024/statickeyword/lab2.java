package MAy2024.ex21052024.statickeyword;

public class lab2 {
    public static void main(String[] args) {
        person p1= new person("shweta");
        person p2= new person("shka");
        System.out.println(person.footballclub);
        person.m1();
        p1.m2();
        p2.m2();
        //person.m2(); non static methods can not called without reference


    }
}
class person{
    static String footballclub= "Arsenal";
    {
        System.out.println("IIB");
    }
    String name;
public person(String name){
        this.name=name;
}
static void m1(){
    System.out.println("I am a common function");
}
void m2(){
    System.out.println("Person details"+ this.name);
}
}
