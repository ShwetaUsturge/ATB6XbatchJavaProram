package MAy2024.EX14052024;

public class Bank {
    public Bank(String bankName, int balance, String bankCode) {
        BankName = bankName;
        Balance = balance;
        BankCode = bankCode;
    }

    String BankName;
        int Balance;
        String BankCode;
        Bank()
    {
            BankName="SBI";
            Balance= 2123;
            BankCode= "asc34436";

        }
    void details(){
            System.out.println("BankName->" + BankName);
            System.out.println("Bank Code->"+ BankCode);
            System.out.println("BAlance"+Balance);
        }
    }

