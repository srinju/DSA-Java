import java.util.Arrays;

public class flips {

    public static int longestContiguousOnes(int[] input) {

        int left = 0;
        int right = 0;
        int flip = 0;
        int max = 0;

        while(right < input.length) {
            if(input[right] == 1) // Expand window when current element is 1
                right++;
            else {
                if(flip < 1) { // Flip the first 0 we encounter
                    flip++;
                    right++;
                } else { // When a second 0 is encountered, shrink window from the left
                    if(input[left++] == 0)
                        flip--; // Reset the flip count if we move past a flipped 0
                }
            }
            max = Math.max(max, (right - left)); // Update the max length
        }
        return max;

    }

    public static void main(String[] args) {
        int [] input = {1, 1, 0, 0, 1, 1, 1, 0, 1};
        System.out.println("Input: " + Arrays.toString(input));
        int max = longestContiguousOnes(input);
        System.out.println("Longest contiguous 1's with one flip allowed: " + max);
    }
}