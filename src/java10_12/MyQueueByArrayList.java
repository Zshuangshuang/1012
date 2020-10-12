package java10_12;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-10-12
 * Time:14:09
 **/
public class MyQueueByArrayList {

    private int[] array = new int[100];
    private int head = 0;
    private int tail = 0;
    private int usedSize = 0;

    public void offer(int x){
        if (usedSize == array.length){
            return;
        }
        array[tail] = x;
        tail++;
        if (tail >= array.length){
            tail = 0;
        }
        usedSize++;
    }
    public Integer pool(){
        if (usedSize == 0){
            return null;
        }
         Integer ret = array[head];
         head++;
         if (head >= array.length){
             head = 0;
         }
         usedSize--;
         return ret;

    }
    public Integer peek(){
        if (usedSize == 0){
            return null;
        }
        return array[head];
    }

}
