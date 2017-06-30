package twelve;

/**
 * Created by Administrator on 2017/6/30.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.next();
            StringBuffer sb = new StringBuffer(str);
            sb.reverse();
            System.out.println(sb);
        }
    }
}
