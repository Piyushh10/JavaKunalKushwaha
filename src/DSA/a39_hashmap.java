package DSA;

import java.util.*;

public class a39_hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("huihui", 69);
        map.put("khikhi", 6969);
        map.put("huehue", 696969);

        System.out.println(map.get("lena paul"));
//check other functions

        HashSet<Integer> hs = new HashSet<>();
        hs.add(69);
        hs.add(6969);
        hs.add(696969);
        hs.add(69);

        System.out.println(hs);

        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("a", 1);
        tm.put("c", 2);
        tm.put("b", 3);
        tm.put("e", 5);
        tm.put("d", 4);
        System.out.println(tm);
    }
}
