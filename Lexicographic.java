public class Lexicographic {
    public String makeSmallestPalaindrome(String s) {
        int st = 0;
        int e = s.length() - 1;
        char[] chars = s.toCharArray();
        while(st<=e) {
            if(chars[st] < chars[e]){
                chars[e] = chars[st];
            } else if(chars[st] > chars[e]) {
                chars[st] = chars[e];
            }
            st++;
            e--;
        }
        return new String(chars);
    }
    public static void main(String[] args) {
        Lexicographic solution = new Lexicographic();
        String s1 = "egcfe";
        System.out.println(solution.makeSmallestPalaindrome(s1));
    }
}
