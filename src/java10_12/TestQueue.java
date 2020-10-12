package java10_12;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-10-12
 * Time:14:20
 **/
public class TestQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        int ret = queue.poll();
        System.out.println(ret);
        ret = queue.poll();
        System.out.println(ret);
    }

}
