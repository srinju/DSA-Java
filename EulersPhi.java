import java.util.*;

public class EulersPhi {
    public static int eulersphi(int n) {
        int result = n;
        for(int p =2 ; p<=n ; p++) {
            if(n%p ==0) {
                while(n%p == 0) {
                    n /= p;
                }
                result -= result / p ;
            }
        }
        if(n > 1) {
            result -= result /n ;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("euler's totient function of " + n + "is " + eulersphi(n));
    }
}
