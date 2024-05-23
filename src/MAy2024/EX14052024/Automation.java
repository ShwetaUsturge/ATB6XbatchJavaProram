package MAy2024.EX14052024;

public class Automation {
    public Automation(String name) {
        this.name = name;
    }

    String name;
    Automation(){
        databaseconnection();
        excelopenconnection();

    }
    void databaseconnection(){
        System.out.println("Mysql Connection is Created");
    }
    void excelopenconnection(){
        System.out.println("excel opened");
    }
    void test1(){
        System.out.println("Testcase1" + this.name);
    }
    void test2(){
        System.out.println("Testcase2" + this.name);
    }

    public static void main(String[] args) {
        Automation tc1= new Automation("tc1");
        Automation tc2 = new Automation("tc2");
        System.out.println(tc1.name);
        tc1.test1();
        tc1.test2();
        System.out.println(tc2.name);
        tc2.test1();
        tc2.test2();
    }
}
