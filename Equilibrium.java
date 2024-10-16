public class Equilibrium {
    public static int solution(long arr[] , int n) {
        if(n == 1) {
            return 1;
        }
        int lsum  = 0 , rsum = 0;
        for(int i = 0 ; i< n ; i ++) {
            lsum = 0;
            for(int k = 0; k < i ; k ++) {
                lsum += arr[k];
            }
            rsum = 0;
            for(int j = i+1;j < n ; j ++) {
                rsum += arr[j];
            }
            if(lsum == rsum) {
                return i+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        long[] arr = {1,3,5,2,2};
        int n = arr.length;
        System.out.println(solution(arr, n));
    }
}
