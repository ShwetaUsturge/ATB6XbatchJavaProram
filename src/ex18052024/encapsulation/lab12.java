package ex18052024.encapsulation;

public class lab12 {
    public void main(String[] args) {
        vlogin v1=new vlogin("admin","admin123");
        v1.username="admin";
        String username= v1.getUsername();
//code to Auth
        //String Password = v1.getPassword(false);
       // System.out.println(Password);
        v1.setPassword("shweta",true);

    }

    class vlogin {
        public vlogin(String username, String password) {
            this.username = username;
            this.password = password;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword(boolean isAuth) {
            if(isAuth){
            return password;
        }
            else{
                return "Not allowed";
            }
        }

        public void setPassword(String password, boolean isAuth) {
            if(isAuth){
            this.password = password;
        }else {
                System.out.println("Not allowed");
            }
        }

        private String username;
        private String password;

    }
}
