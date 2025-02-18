package DSA;

import java.util.Arrays;

public class a27_practise {
    public static void main(String[] args) {
        String [] word1 = {"ab", "c"};
        String [] word2 = {"a", "bc"};
        System.out.println(isEqual(word1, word2));
        String a = "nfjiewfiwref";
    }
    static boolean isEqual(String [] word1, String [] word2){
        StringBuilder a1 = new StringBuilder();
        StringBuilder a2 = new StringBuilder();
        for(String s : word1){
            a1.append(s);
        }
        for(String a : word2){
            a2.append(a);
        }
        String pehla = a1.toString().trim();
        System.out.println(pehla);
        String dusra = a2.toString().trim();
        System.out.println(dusra);
        return pehla.equals(dusra);
    }
}
