package MAy2024.ex07052024;

import java.util.Scanner;

public class lab82 {
    public static void main(String[] args) {
        //return with parameter
        /* divide the task in to chunks
        calculator- sum task-> sum function
        sub-> sub function
        mul->multiplication function
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1= sc.nextInt();
        System.out.println("Enter num2");
        int num2=sc.nextInt();
        //calci
        int r_sum= sum(num1,num2);
        System.out.println("Sum is ->"+ r_sum);
        int r_sub= sub(num1,num2);
        System.out.println("Sub is=>"+ r_sub);

        int r_mul= mul(num1,num2);
        System.out.println("Mul is=>"+ r_mul);

    }
    static int sum(int a, int b)
    {
        return a+b;
    }
    static int sub(int a, int b){
        return a-b;
    }
    static int mul(int a, int b){
        return a*b;
    }
}
