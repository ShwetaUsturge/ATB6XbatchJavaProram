package MAy2024.Ex30052024;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        //stack
        Stack<String> s1= new Stack<>();
        s1.push("A");
        s1.push("g");
        s1.push("D");
        s1.add("E");
        System.out.println(s1);
        System.out.println(s1.pop());
        System.out.println(s1);
        System.out.println(s1.peek());

    }
}
