package thirteen;
/**
 * Created by Administrator on 2017/6/30.
 * 将一个英文语句以单词为单位逆序排放。
 * 例如“I am a boy”，逆序排放后为“boy a am I”
 * 所有单词之间用一个空格隔开，语句中除了英文字母外，不再包含其他字符
 */
import java.util.Scanner;
public class Main {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            reverseWord(str);
        }
    }
    public static void reverseWord(String sentence){
        String[] arrStr = sentence.split(" ");
        System.out.print(arrStr.length);
        for(int i=0;i<arrStr.length;i++){

            //System.out.print(arrStr[i]+" ");
        }
    }
}
