package fourteen;

/**
 * Created by Administrator on 2017/6/30.
 * 输入第一行为一个正整数n(1≤n≤1000),下面n行为n个字符串(字符串长度≤100),
 * 字符串中只含有大小写字母。
 */
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Vector<String> ve = new Vector<String>();
        for(int i=0;i<num;i++){
            ve.add(sc.next());
        }
        Collections.sort(ve);
        Iterator it = ve.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
