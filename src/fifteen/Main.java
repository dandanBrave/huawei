package fifteen;

/**
 * Created by Administrator on 2017/7/1.
 * 输入一个int型的正整数，计算出该int型数据在内存中存储时1的个数。
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int total = 0;
        Scanner sc =  new Scanner(System.in);
        while (sc.hasNext()){
            int num = sc.nextInt();
            String numBin = Integer.toBinaryString(num);
            char[] numArr = numBin.toCharArray();
            for(int i=0;i<numArr.length;i++){
                if(numArr[i]=='1'){
                    total++;
                }
            }
            System.out.println(total);
        }
    }
}
