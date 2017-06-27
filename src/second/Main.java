package second;
import java.util.*;

public class Main {
    public static void main(String[] args){
        int count = 0;
        Scanner sc = new Scanner(System.in);
        String aString = sc.nextLine().toUpperCase();
        char s = sc.nextLine().toUpperCase().toCharArray()[0];
        for(int i=0;i<aString.length();i++){
            if(s==aString.charAt(i)){
                count++;
            }
        }
        System.out.println(count);
    }
}
