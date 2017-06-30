package nine;

/**
 * Created by Administrator on 2017/6/30.
 * 输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
 */
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String num = sc.next();
            char[] numChar = num.toCharArray();
            Set<Character> set = new LinkedHashSet<Character>();
            for(int i=numChar.length-1;i>=0;i--){
                set.add(numChar[i]);
            }
            Iterator<Character> iterator = set.iterator();
            while(iterator.hasNext()){
                Character c = (Character)iterator.next();
                System.out.print(c);
            }
        }
    }
}
