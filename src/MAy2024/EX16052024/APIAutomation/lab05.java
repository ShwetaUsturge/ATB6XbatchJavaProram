package MAy2024.EX16052024.APIAutomation;

public class lab05 {
    public static void main(String[] args) {
        test t1= new test();
        t1.openexcelfile();
        t1.opensql();
        int a= t1.API_VERSION;
        System.out.println(a);

        ///
        commontoall c= new test();
        c.openexcelfile();
    }}
