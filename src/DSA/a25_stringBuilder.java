package DSA;

import java.util.Arrays;
import java.util.Locale;

public class a25_stringBuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        str.append("Hello");
        System.out.println(str.toString());
        StringBuilder str2 = new StringBuilder("World");
        System.out.println(str2.toString());


        StringBuilder str3 = new StringBuilder(10);
        System.out.println(str3.capacity());

//        StringBuilder is mutable, and it has a lot of internal methods


//        Now let's see some string methods
        String name = "Piyush Shivnani";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.indexOf("s"));

    }
}
