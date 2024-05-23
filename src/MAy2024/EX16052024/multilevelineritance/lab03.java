package MAy2024.EX16052024.multilevelineritance;

public class lab03 {
    public static void main(String[] args) {
        child c= new child();
        c.home();
        grandfather g= new grandfather();
        g.home();
        father f=new father();
        f.home();

        //dynamic dispath
        grandfather g1 =new child();
        g1.home();
        grandfather g2 =new father();
        grandfather g3 =new grandfather();

        //reverse dispath is not possible
        //child c1= new grandfather();

    }
}
