package six;

/**
 * Created by Administrator on 2017/6/29.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            long num = sc.nextLong();
            getResult(num);
        }
    }
    public static void getResult(long ulDataInput){
        while(ulDataInput!=1){
            for(int i=2;i<=ulDataInput;i++){
                if(ulDataInput%i == 0){
                    ulDataInput /= i;
                    System.out.print(i+" ");
                    break;
                }
            }
        }
    }
}
