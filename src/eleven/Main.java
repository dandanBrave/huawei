package eleven;

/**
 * Created by Administrator on 2017/6/30.
 * 输入一个整数，将这个整数以字符串的形式逆序输出程序不考虑负数的情况，
 * 若数字含有0，则逆序形式也含有0，如输入为100，则输出为001
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String num = sc.next();
            StringBuffer sb = new StringBuffer(num);
            sb.reverse();
            System.out.println(sb.toString());
        }
    }
}
