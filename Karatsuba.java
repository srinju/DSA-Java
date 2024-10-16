import java.util.Scanner;

public class Karatsuba {
    // Get the number of digits in the number
    public static int getNumDigits(int x) {
        if (x == 0) return 1;
        int count = 0;
        while (x > 0) {
            count++;
            x /= 10;
        }
        return count;
    }

    // Karatsuba multiplication
    public static int Kar(int x, int y) {
        // Base case: if x or y is a single-digit number, multiply them directly
        if (x < 10 || y < 10) {
            return x * y;
        }

        // Get the maximum number of digits from both numbers
        int m = Math.max(getNumDigits(x), getNumDigits(y));
        int halfM = m / 2;

        // Split the numbers into two parts
        int powerOfTen = (int) Math.pow(10, halfM);
        int a = x / powerOfTen;
        int b = x % powerOfTen;
        int c = y / powerOfTen;
        int d = y % powerOfTen;

        // Recursively calculate the three necessary products
        int ac = Kar(a, c);
        int bd = Kar(b, d);
        int ab_cd = Kar(a + b, c + d);

        // Combine the results
        int result = ac * (int) Math.pow(10, 2 * halfM) + (ab_cd - ac - bd) * powerOfTen + bd;

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int answer = Kar(n1, n2);
        System.out.println("Product: " + answer);
        sc.close();
    }
}
