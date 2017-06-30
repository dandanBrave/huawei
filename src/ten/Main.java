package ten;
/**
 * Created by Administrator on 2017/6/30.
 * 编写一个函数，计算字符串中含有的不同字符的个数。
 * 字符在ACSII码范围内(0~127)。不在范围内的不作统计。
 */
import java.util.HashSet;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       while(sc.hasNext()){
           HashSet<Character> set = new HashSet<Character>();
           String str = sc.next();
           char[] c = str.toCharArray();
           for(char eachc:c){
               if(Integer.valueOf(eachc)>=0 && Integer.valueOf(eachc)<=127){
                   set.add(eachc);
               }
           }
           System.out.println(set.size());
       }
    }
}