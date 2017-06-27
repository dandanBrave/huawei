package four;

/**
 * Created by Administrator on 2017/6/27.
 * •连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
 * 长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
 */
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        String second = sc.nextLine();
        Print(first);
        Print(second);
        sc.close();
    }
    public static void Print(String str){
        int length = str.length();
        if(0<length&&length<=8){
            for(int i=length;i<8;i++){
                str += '0';
            }
            System.out.println(str);
        }
        if(length>8){
            int line = length/8;
            int lastLine = length%8;
            for(int i=0;i<line;i++){
                System.out.println(str.substring(8*i,8*(i+1)));
            }
            if(lastLine!=0){
                String str1 = str.substring(8*line);
                for(int i=str1.length();i<8;i++){
                    str1+="0";
                }
                System.out.println(str1);
            }
        }
    }
}
