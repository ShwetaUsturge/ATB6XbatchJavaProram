package MAy2024.ex21052024.statickeyword;

public class lab1 {
    public static void main(String[] args) {
        ATB Shweta=  new ATB("3545235");
        ATB prashant= new ATB("454635");
        System.out.println(ATB.coursename);
        prashant.Printdetails();
        Shweta.Printdetails();
        ATB shwet=null;
    }
}
class ATB{
    static {
        System.out.println("SIB  loaded only one time");
    }
    {
        System.out.println("IIB instance initialization block loaded when object is created");
    }
    static String coursename= "ATB";
    String Phonenumber;

    public ATB(String phonenumber) {
        Phonenumber = phonenumber;
    }
    public void Printdetails(){
        System.out.println("Your Details" + this.Phonenumber);
    }
}

