package Vector;
import java.util.Stack;

public class Stack1 {
    public static void main(String[] args)
    {
        // Create a new stack
        Stack<Integer> s = new Stack<>();

        // Push elements onto the stack
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        System.out.println(s.pop());
        System.out.println(s.peek());;
        System.out.println(s.empty());;
       System.out.println( s.search(3));;
    }
}