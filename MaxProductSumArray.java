import java.util.Scanner;

public class MaxProductSumArray {
    public static int maxproduct(int[] arr) {
        int n = arr.length;
        int pre = 1  , suff = 1;
        int ans = Integer.MIN_VALUE;
        for(int i = 0 ; i <n ; i++) {
            if(pre == 0) pre = 1;
            if(suff == 0) suff = 1;
            ans = Math.max(ans, Math.max(pre, suff));
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        int answer = maxproduct(arr);
        System.out.println(answer);
        sc.close();
    }
}