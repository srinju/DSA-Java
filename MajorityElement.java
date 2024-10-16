import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
   public static int majority(int[] arr) {
       int n = arr.length;
       HashMap<Integer,Integer> map = new HashMap<>();
       //storing the elements with its occurence
       for(int i = 0 ; i< n ; i++) {
        int value = map.getOrDefault(arr[i], 0);
        map.put(arr[i], value+1);
       }
       //searching for the majority elements>
       for(Map.Entry<Integer,Integer> it : map.entrySet()) {
            if(it.getValue() > (n/2)) {
                return it.getKey();
            } 
       }
       return -1;
   }
   public static void main(String[] args) {
    int[] arr = {2,2,1,1,1,2,2};
    int ans = majority(arr);
    System.out.println(ans);
   }
}
