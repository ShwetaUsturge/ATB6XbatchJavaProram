package EX14052024;

public class Man {
    String name;
    int age;
    Man(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
//copy constructor

    Man(Man Man){
        this.name= Man.name;
        this.age= Man.age;
    }


    public static void main(String[] args) {
        Man M1= new Man("s",29);
        System.out.println(M1.name  +  " is " + M1.age + " Years Old");
        Man M2 = new Man(M1);
        Man M3 = new Man(M1);
    }
}
