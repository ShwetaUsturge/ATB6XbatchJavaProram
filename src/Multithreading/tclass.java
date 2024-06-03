package Multithreading;

public class tclass{
    public static void main (String[]args){
        demo1<Integer> i= new demo1<Integer>(5);
        System.out.println(i.getObject());
        demo1<Double> i2= new demo1<Double>(7.9);
        System.out.println(i2.getObject());
        demo1<String> i3= new demo1<String>("Shweta");
        System.out.println(i3.getObject());

    }


}
