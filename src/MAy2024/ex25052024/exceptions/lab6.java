package MAy2024.ex25052024.exceptions;
import MAy2024.ex25052024.Bank;

public class lab6 {
    public static void main(String[] args) throws Exception {
        Bank sbi=new Bank("INR",600);
        Bank jpmorgan= new Bank("USD",900);
        Integer total= sbi.add(jpmorgan);
        System.out.println(total);
    }
}
