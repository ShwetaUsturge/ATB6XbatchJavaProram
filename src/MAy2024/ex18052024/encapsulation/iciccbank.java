package MAy2024.ex18052024.encapsulation;

public class iciccbank {
    private String name;
   private long balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        if (balance > 0) {
            this.balance = balance;
        } else {
            System.out.println("Not Allowed");
        }
    }
    public iciccbank(String name, long balance) {
        this.name = name;
        this.balance = balance;
    }

}
