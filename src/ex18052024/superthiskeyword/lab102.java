package ex18052024.superthiskeyword;

public class lab102 {
    public static void main(String[] args) {
        student s= new student();
        s.display();

    }
}
class person{
    void message(){
        System.out.println("I am person");
    }
}
class student extends person{
    void message(){
        System.out.println("I am student");
    }
    void display(){
        this.message();
        super.message();
    }
}
