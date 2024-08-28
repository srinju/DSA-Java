// find all the prime numbers >>

import java.util.*;
public class simpleSeive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int n = sc.nextInt();
        sc.close();
        boolean[] isPrime = new boolean[n];
        for(int i = 0 ; i < isPrime.length; i++) { //mark all as true
            isPrime[i] = true;
        }
        for( int i = 2 ; i < Math.sqrt(n) ; i++) { // in underroot n range if there is true then mark the multiples of that n as false 
            if(isPrime[i] == true) {
                for(int j = i*i ; j < n; j +=i) {
                    isPrime[j] = false;
                }
            }
        }
        System.out.println("list of prime numbers are : ");
        for(int i = 2 ; i < isPrime.length ; i++) { //in that range if there is true present then those are prime numbers so return those 
            if(isPrime[i] == true) {
                System.out.println(i);
            }
        }
    }
}
