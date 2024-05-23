package ex18052024;

public class realtimeinheritance {
    public static void main(String[] args) {
        test1 t1= new test1();
        t1.setBrowser("edge",true);
        t1.openbrowser();
        t1.closebrowser();
        baseclass b1= new test1();//dynamic dispathch
    }
}
class test1 extends baseclass{//single inheritance
    @Override
    public void setBrowser(String browser, boolean isAuth) {
        super.setBrowser(browser, isAuth);
    }
}

class baseclass{
    private String browser;
    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser, boolean isAuth) { //encapsulation
        if(isAuth){
        this.browser = browser;
    }else {
            System.out.println("Not Allowed");
        }
    }


    void openbrowser(){
        System.out.println("Chrome Browser");
    }
    void openbrowser(String browsername){
        System.out.println("Open Browser!!="+ browsername);
    }
    void closebrowser(){
        System.out.println();
    }
}
