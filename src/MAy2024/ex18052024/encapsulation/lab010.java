package MAy2024.ex18052024.encapsulation;

public class lab010 {
    public void main(String[] args) {
        login l= new login("admin","adf223");
        l.username= "Admin";
        l.Password="1234";
        System.out.println(l.Password);
        System.out.println(l.username);
    }
    class login{
        public login(String username, String password) {
            this.username = username;
            this.Password = password;
        }

        private String username;
       private String Password;
    }
}
