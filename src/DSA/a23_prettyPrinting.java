package DSA;

import java.util.ArrayList;

public class a23_prettyPrinting {
    public static void main(String[] args) {
        float a = 453.1274f;
//        System.out.printf("Formatted number is %.2f", a);
//        printf will also round-off the number
//        System.out.println();
//        System.out.printf("PI: %.3f",Math.PI);
//        System.out.println();
//        System.out.printf("Hello my name is %s and I am a %s", "Piyush", "Computer Science student");

        /*
        PLACEHOLDERS LIST =>

        %c - Character
        %d - Decimal number (base 10)
        %e - exponential floating point number
        %f - Floating point number
        %i - Integer (base 10)
        %o - Octal number (base 8)
        %s - string
        %u - Unsigned decimal (integer) number
        %x - Hexadecimal number (base 16)
        %t - Date/time
        %n - NewLine

         */

        System.out.println('a' + 'b');
//        this will print the sum of their ASCII values which is 195
        System.out.println("a" + "b");
//        this will print ab
        System.out.println((char)('a' + 3));
//        a+3 will give 100 and its char value will be d
        System.out.println("a" + 1);
//        int will be converted to Integer that will call .toString
        System.out.println("Piyush" + new ArrayList<>());
//        it will print Piyush[]
        System.out.println("Piyush" + new Integer(69));
//        will print Piyush69

        /*
        while adding any other 2 data types, say int and arraylist. You cannot add
        them directly unless there is atleast one String as '+' operator only works
        for primitives, also the answer will always be of data type String.
        For eg-
         */
        System.out.println(new Integer(69) + "" + new ArrayList<>());

    }
}
