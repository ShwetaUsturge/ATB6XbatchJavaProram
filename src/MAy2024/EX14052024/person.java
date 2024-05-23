package MAy2024.EX14052024;

public class person {
    public person(String name, long phonrnumber, String email, boolean ismarried, String coursename) {
        this.name = name;
        this.phonrnumber = phonrnumber;
        this.email = email;
        this.ismarried = ismarried;
        this.coursename = coursename;
    }

    String name;
    long phonrnumber;
    String email;
    boolean ismarried;
    String coursename;

    void printdetails(){

    }
    // deffault constructor
    person()
    {
        System.out.println("Hello , I will be called when you create an object");
    }
    // parameterised constructors
    person(String givenname, long phonrnumber){
        System.out.println("Parameterised constructors");
        this.name=givenname;
        this.phonrnumber= phonrnumber;
    }
}
