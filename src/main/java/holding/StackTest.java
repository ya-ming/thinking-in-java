package holding;

import net.mindview.util.Stack;
import static net.mindview.util.Print.printnb;

public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        for (String s : "My dog has fleas".split(" "))
            stack.push(s);
        while(!stack.empty())
            printnb(stack.pop() + " ");
    }
}
