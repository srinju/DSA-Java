import java.util.*;

public class strogrammaticNumber {
    public static boolean strogrammatic(String n) {
        HashMap<Character,Character> SD = new HashMap<>();
        SD.put('1','1');
        SD.put('6','9');
        SD.put('9','6');
        SD.put('8','8');
        SD.put('0','0');
        
        int left = 0 , right = n.length()-1;

        while(left <= right) {
            char leftchar = n.charAt(left);
            char rightchar = n.charAt(left);

            if(!SD.containsKey(leftchar) || SD.get(leftchar) != rightchar) {
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        String n = sc.nextLine();
        sc.close();
        if(strogrammatic(n)){
            System.out.println("yes!");
        } else {
            System.out.println("false");
        }
    }
}
