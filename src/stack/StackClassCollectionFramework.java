package stack;

import java.util.Stack;

public class StackClassCollectionFramework {
    public static void main(String[] args) {
        System.out.println("Stack Implementation using Collection Framework...");

        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
}
