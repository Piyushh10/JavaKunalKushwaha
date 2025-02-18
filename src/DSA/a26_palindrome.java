package DSA;

public class a26_palindrome {
    public static void main(String[] args) {
        String a = "abcdcba";
        System.out.println(isPalindrome(a));
        String b = "NotAPalindrome";
        System.out.println(isPalindrome(b));
        String c = null;
        System.out.println(isPalindrome(c));
        String d = "A";
        System.out.println(isPalindrome(d));
    }

    static boolean isPalindrome(String a) {
        if ( a == null  || a.length() == 0){
            return true;
        }
        a = a.toLowerCase();
        for (int i = 0; i <= a.length() / 2; i++) {
            char start = a.charAt(i);
            char end = a.charAt(a.length()-1 - i);
            if(start != end){
                return false;
            }
        }
        return true;
    }
}
