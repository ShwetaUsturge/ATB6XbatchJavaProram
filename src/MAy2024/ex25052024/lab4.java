package MAy2024.ex25052024;

public class lab4 {
    public static void main(String[] args) {
        ENDPOINTS e= ENDPOINTS.Login;
        switch (e){
            case Home -> System.out.println("HOme page should be displayed");
            case Login -> System.out.println("Login page code should be displayed");
            case Dashboard -> System.out.println("dashboard page should be displayed");
        }
    }
}
