package MAy2024.Ex11052024;

public class lab91 {
    public static void main(String[] args) {
        //object class
        System.out.println("hello");
        //here we are creating a object of person class with the same name of class
        Person personRef = new Person();
        // ClassName Objectref = Object()->(new classname())
        // Class--> is just a blueprint --which have Attributes and behavior which is not real
        //Object --> real entities which are created from class-Atriibutes and behaviour
       personRef.name= "Shweta";
        System.out.println(personRef.name);
        Person kanika= null;
        System.out.println(kanika);
        Person p= new Person();
        p.age=28;
        System.out.println(p.age);
    }
}
