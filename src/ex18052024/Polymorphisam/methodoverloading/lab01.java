package ex18052024.Polymorphisam.methodoverloading;

public class lab01 {
    //methodoverloadig
    void gift(String  s){
        System.out.println("Message is->" +s);
    }
    int gift(int  x){
        System.out.println("X is->" +x);
        return x;
    }
    float gift(float f){
        System.out.println("floate is->" +f);
        return 89;
    }
    double gift(double d){
        System.out.println("X is a double->" +d);
        return 23.45;
    }

    public static void main(String[] args) {
        lab01 p=new lab01();
        p.gift(10);
        p.gift(34.3);
        p.gift("dfs");
    }
}

