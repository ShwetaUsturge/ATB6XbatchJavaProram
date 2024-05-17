package EX14052024;

public class Automation {
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
        System.out.println("TC1");
    }
    void test2(){
        System.out.println("TC2");
    }

    public static void main(String[] args) {
        Automation A= new Automation();
        A.test1();
        A.test2();
    }
}
