package five;
/**
 * Created by Administrator on 2017/6/29.
 */
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String numStr = sc.next().substring(2);
            System.out.println(Integer.parseInt(numStr,16));
        }
    }
}
