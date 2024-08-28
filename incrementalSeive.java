import java.util.*;

public class incrementalSeive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = sc.nextInt();
        sc.close();

        List<Integer> primes = new ArrayList<>();
        List<Integer> oddNos = new ArrayList<>();
        primes.add(2);  // 2 is the first prime number

        // Adding odd numbers to the list
        for (int i = 3; i <= n; i += 2) {
            oddNos.add(i);
        }

        // Incremental Sieve process
        for (int i = 0; i < oddNos.size(); i++) {
            int temp = oddNos.get(i);
            if (temp == -1) {
                continue;
            }
            // Marking non-prime numbers
            for (int j = i + 1; j < oddNos.size(); j++) {
                if (oddNos.get(j) % temp == 0) {
                    oddNos.set(j, -1);
                }
            }
        }

        // Adding remaining prime numbers from oddNos list to primes
        for (int num : oddNos) {
            if (num != -1) {
                primes.add(num);
            }
        }

        // Printing all prime numbers
        for (int prime : primes) {
            System.out.println(prime);
        }
    }
}
