package java10_12;

import java.util.Stack;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-10-12
 * Time:14:18
 **/
public class TestStack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        int ret = stack.pop();
        System.out.println(ret);
        ret = stack.pop();
        System.out.println(ret);
        ret = stack.pop();
        System.out.println(ret);
    }
}
