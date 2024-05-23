package ex18052024.superthiskeyword;

public class lab101 {
    public static void main(String[] args) {
        car c= new car();
        c.display();

    }

}
class car extends vehicle{
    int maxspeed = 180;
    void display(){

        System.out.println("max speed of a car can be " + this.maxspeed);
        System.out.println("MAx speed of a car can be" + super.maxspeed);
    }
}
class vehicle{
    int maxspeed= 100;
    void message(){
        System.out.println("This is vehicle class");
    }

}


