package seven;

/**
 * Created by Administrator on 2017/6/29.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            float num = sc.nextFloat();
            System.out.println(Math.round(num));
        }
    }
}
