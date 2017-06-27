/**
 * Created by Administrator on 2017/6/27.
 * 明明想在学校中请一些同学一起做一项问卷调查，为了实验的客观性，
 * 他先用计算机生成了N个1到1000之间的随机整数（N≤1000），对于其中重复的数字，
 * 只保留一个，把其余相同的数去掉，不同的数对应着不同的学生的学号。然后再把这些数从小到大排序，
 * 按照排好的顺序去找同学做调查。请你协助明明完成“去重”与“排序”的工作。
 */
package third;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int[] arrayA = new int[n];
            for(int i=0;i<n;i++){
                arrayA[i] = sc.nextInt();
            }
            int[] arrayC = removeRepeat(arrayA);
            for(int i=0;i<1000;i++){
                if(arrayC[i]==1){
                    System.out.println(i);
                }
            }
        }

    }
    public static int[] removeRepeat(int[] arrayA){
        int[] arrayB = new int[1000];
        for (int i=0;i<1000;i++){
            arrayB[i] = 0;
        }
        for(int i=0;i< arrayA.length;i++){
            arrayB[arrayA[i]] = 1;
        }
        return arrayB;
    }

}
