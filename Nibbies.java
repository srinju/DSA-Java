import java.util.Scanner;

public class Nibbies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int swapnum;
        swapnum = ((num & 0x0F) << 4 | (num & 0x0F) >> 4);
        System.out.println(swapnum);
        sc.close();
    }
}
