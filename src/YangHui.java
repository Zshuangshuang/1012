import java.util.ArrayList;
import java.util.List;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-10-12
 * Time:10:52
 **/
public class YangHui {

    public List<List<Integer>> generate(int numRows){
        //合法性判断
        if (numRows <= 0){
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> firstLine = new ArrayList<>();
        firstLine.add(1);
        result.add(firstLine);
        if (numRows == 1){
            return result;
        }
        List<Integer> secondLine = new ArrayList<>();
        secondLine.add(1);
        secondLine.add(1);
        result.add(secondLine);
        if (numRows == 2){
            return result;
        }
        for (int row = 3; row <= numRows; row++) {
            List<Integer> preLine = result.get(row-1-1);
            List<Integer> curLine = new ArrayList<>();
            curLine.add(1);
            for (int col = 2; col < row; col++) {
                int curNum= preLine.get(col-1-1)+preLine.get(col-1);
                curLine.add(curNum);
            }
            curLine.add(1);
            result.add(curLine);
        }
return result;
    }
}
