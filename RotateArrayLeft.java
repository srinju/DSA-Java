import java.util.Arrays;

public class RotateArrayLeft {
    public void reverse(int[] nums , int low , int high) {
        while(low < high) {
            int temp  = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;
            low ++ ;
            high --;
        }
    }
    public void rotate(int[] nums , int k) {
        int n = nums.length;
        k = k%n;
        reverse(nums, 0, k-1); //reverse the first part
        reverse(nums, k, n-1); //reverse the second paart
        reverse(nums, 0, n-1); //reverse the entire array
    }
    public static void main(String[] args) {
        RotateArrayLeft rotateArrayLeft = new RotateArrayLeft();
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotateArrayLeft.rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }
}
