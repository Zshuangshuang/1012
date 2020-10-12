package java10_12;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-10-12
 * Time:13:26
 **/
public class MyQueue {


    //静态内部类
    static class Node{
        public int val;
        public Node next;

        public Node(int val) {
            this.val = val;
            this.next = next;
        }
    }
    public Node head = null;
    public Node tail = null;

    //入队列
    public void offer(int val){
        Node node = new Node(val);
        if (this.head == null){
            this.head = node;
            this.tail = node;
            return;
        }
        tail.next = node;
        tail = tail.next;
    }
    //出队列
    public Integer poll(){
        if (head == null){
            return null;
        }
        int ret = head.val;
        head = head.next;
        if (head == null){
            tail = null;
        }
        return ret;
    }

    //取队首元素
public Integer peek(){
        if (head == null){
            return null;
        }
       return head.val;
}
}
