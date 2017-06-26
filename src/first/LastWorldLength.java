package first;
import java.util.*;

public class LastWorldLength {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] arr = line.split(" ");
        System.out.println(arr[arr.length-1].length());
    }

}
