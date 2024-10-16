import java.util.Arrays;

public class RotateArrayRight { //clockwise or right rotate
    public void reverse(int[] nums , int low , int high) {
        while(low<high){
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;
            low++;
            high--;
        }
    }
    public void rotate(int[] nums , int k) {
        int n = nums.length;
        k = k %n ; //in case k is greater than n
        reverse(nums, 0, n-k-1); //reverse the first part
        reverse(nums, n-k, n-1); //reverse the second part
        reverse(nums, 0, n-1); //reverse the entire array
    }
    public static void main(String[] args) {
        RotateArrayRight rotateArray = new RotateArrayRight();
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotateArray.rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }   
}
