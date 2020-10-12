package java10_12;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-10-12
 * Time:13:16
 **/
public class MyStack {
    private int[] array = new int[100];
    private int usedSize = 0;

    //入栈

    public void push(int x){
        array[usedSize] = x;
        usedSize++;
    }
    //取栈顶元素
    public int peek(){
        return array[usedSize-1];
    }

    //出栈
    public int pop(){
        int ret = array[usedSize-1];
        usedSize--;
        return ret;
    }






    public static void main(String[] args) {

    }
}
