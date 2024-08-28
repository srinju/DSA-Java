import java.util.*;

public class SegmentedSeive {
    //simple seive >>
    public static List<Integer> simpleseive(int limit) {
        boolean[] prime = new boolean[limit + 1];
        ArrayList<Integer> primes = new ArrayList<>();

        for(int i=0 ; i<=limit ; i++) {
            prime[i] =true;
        }
        for(int j = 2 ; j*j<=limit ; j ++) {
            if(prime[j]){
                for(int i = j*j ; i <=limit ; i+=j) {
                    prime[i] = false;
                }
            }
        }
        for(int j = 2 ; j<=limit ; j++) {
            if(prime[j]){
                primes.add(j);
            }
        }
        return primes;
    }

    //function to perform the segmented sieve>>

    public static List<Integer> segmentedseive(int low , int high) {
        int limit = (int) Math.floor(Math.sqrt(high) + 1);
        List<Integer> primes = simpleseive(limit);

        boolean[] mark = new boolean[high - low + 1];

        for (int i=0 ; i<mark.length ; i++){
            mark[i] = true;
        }

        for (int prime : primes) {
            int lowerlimit = Math.max(prime*prime, (low+prime-1)/prime*prime);

            for(int j=lowerlimit ; j<=high ; j+=prime) {
                mark[j-low] = false;
            }
        }

        List<Integer> primenumbers = new ArrayList<>();
        for(int i = low ; i<=high ; i++) {
            if(mark[i-low] && i!=1) {
                primenumbers.add(i);
            }
        }
        return primenumbers;
    }

    public static void main(String[] args) {
        int low = 80;
        int high = 90;
        List<Integer> primes = segmentedseive(low, high);
        System.out.println("prime numbers between" + low + "and" + high + "are: " + primes );
    }
}
