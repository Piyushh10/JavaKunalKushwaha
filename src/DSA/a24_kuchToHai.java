package DSA;

import org.w3c.dom.ls.LSOutput;

public class a24_kuchToHai {
    public static void main(String[] args) {
//        A's ASCII = 65
//        a's ASCII = 97
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            System.out.println(ch);
            series += ch;
        }
        System.out.println(series);
    }
}
