import java.util.Scanner;

public class binarPalindrome {
    public static boolean palindrome(int n) {
        String s = Integer.toBinaryString(n);
        int i =0 ; 
        int j = s.length() - 1;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n = sc.nextInt();
        sc.close();
        System.out.println(palindrome(n));
    }
}
