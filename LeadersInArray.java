import java.util.ArrayList;
import java.util.Collections;

public class LeadersInArray {
    public static ArrayList<Integer> printLeader(int[] arr , int n ) {
        ArrayList<Integer> ans = new ArrayList<>();
        int max = arr[n-1];
        ans.add(arr[n-1]);
        for(int i = n-2 ; i >= 0 ; i--) {
            if(arr[i] > max) {
                ans.add(arr[i]);
                max = arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 6 ; 
        int[] arr = {10,22,12,3,0,6};
        ArrayList<Integer> ans = printLeader(arr, n);
        Collections.sort(ans,Collections.reverseOrder());
        for(int i = 0 ; i< ans.size() ; i++) {
            System.out.println(ans.get(i) + " ");
        }
    }
}
