package eight;

/**
 * Created by Administrator on 2017/6/29.
 */
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            Map<Integer,Integer> map = new TreeMap<Integer,Integer>();
            int num = sc.nextInt();
            for(int i=0;i<num;i++){
                int key = sc.nextInt();
                int value = sc.nextInt();
                if(map.containsKey(key)){
                    map.put(key,map.get(key)+value);
                }else{
                    map.put(key,value);
                }
            }
            for(Integer key:map.keySet()){
                System.out.println(key+" "+map.get(key));
            }
        }
    }
}
