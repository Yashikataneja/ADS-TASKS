
import java.util.Stack;
public class stack {
    public static void main(String[] args) {

    Stack<Object>n=new Stack<>();
    n.push(1);
    n.push("Neeraj");
    n.push(23456789);
    System.out.println(n);
    System.out.println(n.peek());
    n.pop();
    System.out.println(n);
    System.out.println(n.isEmpty());
    System.out.println(n.size());

        
    }
    
    
}
