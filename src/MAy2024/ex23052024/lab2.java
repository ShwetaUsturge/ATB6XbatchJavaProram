package MAy2024.ex23052024;

public class lab2 {
    public static void main(String[] args) {
        car c= new car("lambo");
        car.Engine engine= c.new Engine("400cc");
        engine.start();
        c.drive();
    }
}
class car{
    String make;

    public car(String make) {
        this.make = make;
    }
    void drive(){
        System.out.println("you can drive car");
    }
    class Engine{
        String hoursepower;

        public Engine(String hoursepower) {
            this.hoursepower = hoursepower;
        }
        void start(){
            System.out.println("Engine is started" +make);
        }
        class gearbox{
            void m1(){
                System.out.println("m1");
            }
            void m2(){
                System.out.println("m2 ");
            }
        }
    }
}
